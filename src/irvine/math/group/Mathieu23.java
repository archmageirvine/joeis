package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple sporadic Mathieu group of degree 23.
 * @author Sean A. Irvine
 */
public class Mathieu23 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(2, 1, 4, 3, 5, 6, 8, 7, 10, 9, 11, 12, 14, 13, 16, 15, 17, 18, 20, 19, 22, 21, 23);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(16, 9, 1, 5, 8, 22, 7, 23, 21, 10, 3, 2, 20, 18, 17, 11, 15, 6, 19, 13, 12, 14, 4);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Mathieu group of degree 23.
   * Note constructing this group is quite slow and uses lots of memory.
   */
  public Mathieu23() {
    super(23, GENERATORS, true);
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
    return "M_{23}";
  }
}
