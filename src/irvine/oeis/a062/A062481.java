package irvine.oeis.a062;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A062481 a(n) = n^prime(n).
 * @author Georg Fischer
 */
public class A062481 implements Sequence {

  final Sequence mA000040 = new A000040();
  protected long mN;
  /** Construct the sequence. */
  public A062481() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mA000040.next());
  }

}
