package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The Suzuki group, <code>Sz(8)</code>.
 * @author Sean A. Irvine
 */
public class Suzuki8 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(
    2, 1, 4, 3, 7, 9, 5, 12, 6, 13, 15, 8, 10, 19, 11, 21, 23, 25, 14, 28, 16, 31, 17, 33, 18,
    35, 32, 20, 37, 39, 22, 27, 24, 43, 26, 46, 29, 48, 30, 40, 51, 44, 34, 42, 55, 36, 50, 38, 58, 47,
    41, 60, 61, 59, 45, 62, 63, 49, 54, 52, 53, 56, 57, 65, 64);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(
    3, 2, 5, 6, 8, 10, 11, 1, 12, 14, 16, 17, 18, 4, 20, 22, 24, 26, 27, 29, 30, 7, 32, 9, 34,
    36, 31, 19, 38, 40, 28, 41, 42, 44, 45, 13, 47, 15, 49, 50, 52, 53, 33, 54, 56, 37, 51, 57, 59, 21,
    46, 23, 43, 25, 58, 63, 55, 48, 60, 39, 64, 65, 35, 62, 61);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Suzuki <code>Sz(8)</code> group.
   * Note constructing this group is quite slow.
   */
  public Suzuki8() {
    super(65, GENERATORS, false);
  }

  @Override
  public boolean isSimple() {
    return true;
  }

  /**
   * The permutations generating the group.
   * @return generators
   */
  public Set<IntegerPermutation> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "Sz(8)";
  }
}
