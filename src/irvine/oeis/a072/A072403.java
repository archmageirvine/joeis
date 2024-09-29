package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a029.A029837;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072403 extends Sequence1 {

  private final Sequence mA = new A029837();
  private Q mSum = Q.TWO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.subtract(new Q(Z.ONE, Z.THREE.pow(mA.next())));
    return select(mSum);
  }
}
