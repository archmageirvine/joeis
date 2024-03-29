package irvine.oeis.a214;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007185;

/**
 * A214882 A007185(n)/5^n.
 * @author Georg Fischer
 */
public class A214882 extends Sequence1 {

  final Sequence mA007185 = new A007185();
  protected long mN;
  /** Construct the sequence. */
  public A214882() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA007185.next().divide(Z.FIVE.pow(Z.valueOf(mN)));
  }

}
