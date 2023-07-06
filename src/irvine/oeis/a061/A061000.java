package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;
import irvine.oeis.a060.A060999;

/**
 * A061000 a(n) = Sum_{k=1..n} A060999(k) * k^3.
 * @author Sean A. Irvine
 */
public class A061000 extends Sequence1 {

  private final Sequence mA = new A000578().skip(1);
  private final Sequence mB = new A060999();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mA.next().multiply(mB.next()));
    return mSum;
  }
}
