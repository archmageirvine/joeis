package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple unitary group U4(2).
 * @author Sean A. Irvine
 */
public class Unitary42 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(2, 1, 5, 7, 3, 10, 4, 13, 15, 6, 18, 17, 8, 14, 9, 23, 12, 11, 19, 25, 26, 24, 16, 22, 20, 21, 27);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(3, 4, 6, 8, 9, 11, 12, 14, 16, 17, 19, 20, 21, 22, 15, 10, 5, 24, 1, 13, 7, 2, 23, 27, 18, 25, 26);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the group.
   * Note constructing this group is quite slow.
   */
  public Unitary42() {
    super(27, GENERATORS, false);
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
   * @return generators
   */
  public Set<IntegerPermutation> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "U_4(2)";
  }
}
