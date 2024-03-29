package irvine.oeis.a335;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001316;

/**
 * A335063 a(n) = Sum_{k=0..n} (binomial(n,k) mod 2) * k.
 * @author Georg Fischer
 */
public class A335063 extends Sequence0 {

  final Sequence mA001316 = new A001316();
  protected long mN;
  /** Construct the sequence. */
  public A335063() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA001316.next()).divide(Z.TWO);
  }

}
