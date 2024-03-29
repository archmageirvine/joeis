package irvine.oeis.a228;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000203;

/**
 * A228947 a(n) = sigma(n) - phi(n) - n.
 * @author Georg Fischer
 */
public class A228947 extends Sequence1 {

  final Sequence mA000010 = new A000010();
  final Sequence mA000203 = new A000203();
  protected long mN;
  /** Construct the sequence. */
  public A228947() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA000203.next().subtract(mA000010.next()).subtract(Z.valueOf(mN));
  }

}
