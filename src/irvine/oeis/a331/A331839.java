package irvine.oeis.a331;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000302;
import irvine.oeis.a010.A010050;

/**
 * A331839 a(n) = (4^(n + 1) - 2)*(2*n)!.
 * @author Georg Fischer
 */
public class A331839 extends Sequence0 {

  final Sequence mA000302 = new A000302();
  final Sequence mA010050 = new A010050();
  /** Construct the sequence. */
  public A331839() {
    mA000302.next();
  }
  
  @Override
  public Z next() {
    return mA010050.next().multiply(mA000302.next().subtract(Z.TWO));
  }

}
