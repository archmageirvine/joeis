package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072479 extends Sequence0 {

  private final Sequence mNum = new A072345();
  private final Sequence mDen = new A072346();
  private long mN = -1;

  @Override
  public Z next() {
    return new Q(mNum.next(), mDen.next()).multiply(++mN).den();
  }
}

