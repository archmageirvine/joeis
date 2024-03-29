package irvine.oeis.a295;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a027.A027385;

/**
 * A295500 a(n) = phi(3^n-1), where phi is Euler's totient function (A000010).
 * @author Georg Fischer
 */
public class A295500 extends Sequence1 {

  final Sequence mA027385 = new A027385();
  protected long mN;
  /** Construct the sequence. */
  public A295500() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA027385.next());
  }

}
