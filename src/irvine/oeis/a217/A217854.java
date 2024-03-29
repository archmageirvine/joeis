package irvine.oeis.a217;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;

/**
 * A217854 Product of all divisors of n, positive or negative.
 * @author Georg Fischer
 */
public class A217854 extends Sequence1 {

  final Sequence mA000005 = new A000005();
  protected long mN;
  /** Construct the sequence. */
  public A217854() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).negate().pow(mA000005.next());
  }

}
