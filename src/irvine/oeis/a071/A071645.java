package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a018.A018804;
import irvine.oeis.a051.A051193;
import irvine.oeis.a072.A072109;

/**
 * A071645 a(n) = A051193(A072109(n))/A018804(A072109(n)).
 * @author Sean A. Irvine
 */
public class A071645 extends A072109 {

  private final DirectSequence mA = new A051193();
  private final DirectSequence mB = new A018804();

  @Override
  public Z next() {
    final Z s = super.next();
    return mA.a(s).divide(mB.a(s));
  }
}
