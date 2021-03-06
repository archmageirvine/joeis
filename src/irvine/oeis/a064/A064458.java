package irvine.oeis.a064;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a053.A053831;

/**
 * A064458 Highest power of 11 dividing n!.
 * @author Georg Fischer
 */
public class A064458 implements Sequence {

  final Sequence mA053831 = new A053831();
  protected long mN;
  /** Construct the sequence. */
  public A064458() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA053831.next()).divide(Z.TEN);
  }

}
