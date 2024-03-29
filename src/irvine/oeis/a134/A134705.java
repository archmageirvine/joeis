package irvine.oeis.a134;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000396;

/**
 * A134705 a(n) = n-th perfect number divided by 2^n.
 * @author Georg Fischer
 */
public class A134705 extends Sequence1 {

  final Sequence mA000396 = new A000396();
  protected long mN;
  /** Construct the sequence. */
  public A134705() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000396.next().divide(Z.TWO.pow(Z.valueOf(mN)));
  }

}
