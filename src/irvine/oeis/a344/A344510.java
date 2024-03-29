package irvine.oeis.a344;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018804;

/**
 * A344510 a(n) = Sum_{k=1..n} k * gcd(k,n).
 * @author Georg Fischer
 */
public class A344510 extends Sequence1 {

  final Sequence mA018804 = new A018804();
  protected long mN;
  /** Construct the sequence. */
  public A344510() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(Z.valueOf(mN).add(mA018804.next())).divide(Z.TWO);
  }

}
