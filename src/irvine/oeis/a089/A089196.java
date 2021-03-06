package irvine.oeis.a089;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a032.A032742;

/**
 * A089196 Floor(n / (smallest prime factor of n+1)).
 * @author Georg Fischer
 */
public class A089196 implements Sequence {

  final Sequence mA032742 = new A032742();
  /** Construct the sequence. */
  public A089196() {
    mA032742.next();
  }
  
  @Override
  public Z next() {
    return mA032742.next().subtract(Z.ONE);
  }

}
