package irvine.math.group;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Klein four group.
 * @author Sean A. Irvine
 */
public class KleinGroup extends DirectProduct<Z, Z> {

  private static final CyclicGroup C2 = new CyclicGroup(2);

  /**
   * Construct the Klein four group.
   */
  public KleinGroup() {
    super(C2, C2);
  }

  @Override
  public String toString() {
    return "V";
  }

  @Override
  public CycleIndex cycleIndex() {
    return new CycleIndex("K",
      MultivariateMonomial.create(1, Z.FOUR, Q.ONE_QUARTER),
      MultivariateMonomial.create(2, Z.TWO, new Q(3, 4)));
  }
}
