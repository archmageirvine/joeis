package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple sporadic Mathieu group of degree 24.
 * @author Sean A. Irvine
 */
public class Mathieu24 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(4, 7, 17, 1, 13, 9, 2, 15, 6, 19, 18, 21, 5, 16, 8, 14, 3, 11, 10, 24, 12, 23, 22, 20);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(4, 21, 9, 6, 18, 1, 7, 8, 15, 5, 11, 12, 17, 2, 3, 13, 16, 10, 24, 20, 14, 22, 19, 23);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Mathieu group of degree 24.
   * Note constructing this group is quite slow and uses lots of memory.
   */
  public Mathieu24() {
    super(24, GENERATORS, true);
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
    return "M_{24}";
  }
}
