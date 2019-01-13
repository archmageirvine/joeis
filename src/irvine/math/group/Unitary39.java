package irvine.math.group;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The unitary group, <code>U_3(9)</code>.
 * @author Sean A. Irvine
 */
public class Unitary39 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(IntegerUtils.suckInNumbers("irvine/math/group/resources/u39a.dat"));
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(IntegerUtils.suckInNumbers("irvine/math/group/resources/u39b.dat"));
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the group.
   * Note constructing this group is quite slow.
   */
  public Unitary39() {
    super(730, GENERATORS, true);
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
    return "U_3(9)";
  }
}
