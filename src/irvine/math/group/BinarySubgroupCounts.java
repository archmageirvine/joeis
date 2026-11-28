package irvine.math.group;

/**
 * Counts of subgroups and their conjugacy classes in small binary linear groups.
 * @author Gregory Morse
 */
public final class BinarySubgroupCounts {

  private static final long[][] COUNTS = new long[6][];

  private BinarySubgroupCounts() { }

  private static long[] reducibleSix() {
    final BinaryGlSubgroups five = new BinaryGlSubgroups();
    final BinaryGlSubgroups one = BinaryGlSubgroups.minimumOne(five);
    final BinaryGlSubgroups two = BinaryGlSubgroups.minimumTwo();
    final BinaryGlSubgroups three = BinaryGlSubgroups.middleSix();
    final BinaryGlSubgroups.Slice four = BinaryGlSubgroups.minimumFour();
    final long classes = (long) one.classes().size() + two.classes().size() + three.classes().size() + four.mClasses
      + BinaryAffineParabolic.minimumFiveClasses(five);
    final long subgroups = one.total() + two.total() + three.total() + four.mSubgroups
      + BinaryAffineParabolic.minimumFive(five).longValueExact();
    return new long[] {classes, subgroups};
  }

  private static long[] countSix() {
    final long[] result = reducibleSix();
    final BinaryWreathSubgroups wreath = new BinaryWreathSubgroups();
    // The ATLAS maximal subgroups of GL(6,2) consist of the parabolics
    // and these four irreducible types. Assign each subgroup to its first type.
    // https://brauer.maths.qmul.ac.uk/Atlas/lin/L62/
    for (final BinaryWreathSubgroups.Group group : wreath.classes()) {
      if (group.mDecompositions != 1) {
        throw new IllegalStateException("An imprimitive subgroup has more than one invariant decomposition");
      }
    }
    result[0] += wreath.classes().size();
    result[1] += wreath.total();
    final BinarySemilinear8Subgroups cubic = new BinarySemilinear8Subgroups(wreath);
    result[0] += cubic.classes();
    result[1] += cubic.total();
    final long[] symplectic = new BinarySymplecticSubgroups().ambientCounts(wreath);
    final long[] quadratic = new BinarySemilinear4Subgroups().ambientCounts(wreath);
    result[0] += symplectic[0] + quadratic[0] + 1;
    result[1] += symplectic[1] + quadratic[1] + 1;
    return result;
  }

  private static long[] compute(final int n) {
    if (n < 5) {
      final BinaryParabolicSubgroups census = BinaryParabolicSubgroups.small(n);
      return new long[] {census.mRepresentatives.size(), census.mRepresentatives.stream().mapToLong(h -> h.mClassSize).sum()};
    }
    if (n == 5) {
      final BinaryGlSubgroups census = new BinaryGlSubgroups();
      return new long[] {census.classes().size(), census.total()};
    }
    return countSix();
  }

  /**
   * Count all subgroups or their conjugacy classes.
   * @param n dimension
   * @param classes true for conjugacy classes, false for all subgroups
   * @return count
   */
  public static synchronized long count(final int n, final boolean classes) {
    if (n < 1 || n > COUNTS.length) {
      throw new UnsupportedOperationException("Binary subgroup census supports dimensions one through six");
    }
    if (COUNTS[n - 1] == null) {
      COUNTS[n - 1] = compute(n);
    }
    return COUNTS[n - 1][classes ? 0 : 1];
  }
}
