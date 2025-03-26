package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A076258 a(n) = 2*sum(k=1,n, A076213(k)) - n.
 * @author Sean A. Irvine
 */
public class A076258 extends Sequence1 {

  private final Sequence mA = new A076213().skip();
  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mA.next());
    return mSum.multiply2().subtract(++mN);
  }
}
