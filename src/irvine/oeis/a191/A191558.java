package irvine.oeis.a191;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061397;

/**
 * A191558 a(n) = 0 if n prime, otherwise n.
 * @author Georg Fischer
 */
public class A191558 extends Sequence1 {

  final Sequence mA061397 = new A061397();
  protected long mN;
  /** Construct the sequence. */
  public A191558() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA061397.next());
  }

}
