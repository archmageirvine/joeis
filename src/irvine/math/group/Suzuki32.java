package irvine.math.group;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The Suzuki group, <code>Sz(32)</code>.
 * @author Sean A. Irvine
 */
public class Suzuki32 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(IntegerUtils.suckInNumbers("irvine/math/group/resources/sz32a.dat"));
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(IntegerUtils.suckInNumbers("irvine/math/group/resources/sz32b.dat"));
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the group.
   * Note constructing this group is quite slow.
   */
  public Suzuki32() {
    super(1025, GENERATORS, true);
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
    return "Sz(32)";
  }
}
