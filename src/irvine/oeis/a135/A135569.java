package irvine.oeis.a135;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000120;

/**
 * A135569 a(n) = S2(n)*2^n; where S2(n) is digit sum of n, n in binary notation.
 * @author Georg Fischer
 */
public class A135569 extends Sequence0 {

  final Sequence mA000120 = new A000120();
  protected long mN;
  /** Construct the sequence. */
  public A135569() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000120.next().multiply(Z.TWO.pow(Z.valueOf(mN)));
  }

}
