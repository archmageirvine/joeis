package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A061354 Numerator of Sum_{k=0..n} 1/k!.
 * @author Sean A. Irvine
 */
public class A061354 extends A000142 {

  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    mA = mA.add(new Q(Z.ONE, super.next()));
    return mA.num();
  }
}

