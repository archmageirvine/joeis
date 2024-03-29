package irvine.oeis.a272;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000806;

/**
 * A272261 Number of one-to-one functions f from [n] to [2n] where f(x) may not be equal to x or to 2n+1-x.
 * @author Georg Fischer
 */
public class A272261 extends Sequence0 {

  final Sequence mA000806 = new A000806();
  protected long mN;
  /** Construct the sequence. */
  public A272261() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000806.next().abs().multiply(Z.TWO.pow(Z.valueOf(mN)));
  }

}
