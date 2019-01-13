package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple unitary group U3(4).
 * @author Sean A. Irvine
 */
public class Unitary34 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(
    2, 1, 5, 7, 3, 10, 4, 12, 13, 6, 16, 8, 9, 20, 21, 11, 24, 25, 27, 14, 15, 31, 32, 17, 18,
    35, 19, 37, 38, 40, 22, 23, 44, 42, 26, 47, 28, 29, 51, 30, 43, 34, 41, 33, 55, 52, 36, 57, 58, 59,
    39, 46, 62, 60, 45, 61, 48, 49, 50, 54, 56, 53, 64, 63, 65);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(
    3, 4, 6, 8, 9, 1, 11, 2, 14, 15, 17, 18, 19, 5, 22, 23, 7, 26, 28, 29, 30, 10, 33, 24, 34,
    12, 36, 13, 39, 41, 42, 43, 16, 45, 46, 48, 49, 50, 20, 52, 21, 53, 54, 44, 25, 56, 40, 27, 57, 60,
    61, 47, 31, 32, 63, 35, 37, 51, 64, 38, 58, 59, 65, 62, 55);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the group.
   * Note constructing this group is quite slow.
   */
  public Unitary34() {
    super(65, GENERATORS, false);
  }

  @Override
  public boolean isSimple() {
    return true;
  }

  @Override
  public boolean isAbelian() {
    return false;
  }

  /**
   * The permutations generating the group.
   *
   * @return generators
   */
  public Set<IntegerPermutation> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "U_3(4)";
  }
}
