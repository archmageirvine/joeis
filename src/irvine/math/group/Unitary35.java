package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple unitary group U3(5).
 * @author Sean A. Irvine
 */
public class Unitary35 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(
    1, 2, 16, 7, 10, 22, 20, 34, 3, 28, 18, 40, 6, 32, 37, 9, 39, 38, 24, 4, 41, 13, 8, 35, 45,
    26, 25, 5, 50, 29, 21, 36, 12, 23, 19, 14, 44, 11, 43, 33, 31, 46, 17, 15, 27, 48, 47, 42, 49, 30);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(
    25, 27, 17, 43, 21, 38, 18, 24, 7, 32, 46, 31, 22, 23, 35, 41, 19, 44, 5, 4, 3, 36, 29, 42, 13,
    47, 20, 6, 48, 9, 37, 50, 39, 49, 28, 1, 34, 15, 8, 14, 10, 33, 2, 30, 11, 26, 45, 40, 12, 16);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the group.
   * Note constructing this group is quite slow.
   */
  public Unitary35() {
    super(50, GENERATORS, false);
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
    return "U_3(5)";
  }
}
