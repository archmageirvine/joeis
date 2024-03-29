package irvine.oeis.a098;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a067.A067275;

/**
 * A098209 a(n) = A067275(n+1)^2 - 1.
 * @author Georg Fischer
 */
public class A098209 extends Sequence0 {

  final Sequence mA067275 = new A067275();
  /** Construct the sequence. */
  public A098209() {
    mA067275.next();
  }
  
  @Override
  public Z next() {
    return mA067275.next().square().subtract(Z.ONE);
  }

}
