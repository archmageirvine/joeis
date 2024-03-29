package irvine.oeis.a219;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a034.A034968;

/**
 * A219651 a(n) = n minus (sum of digits in factorial base expansion of n).
 * @author Georg Fischer
 */
public class A219651 extends Sequence0 {

  final Sequence mA034968 = new A034968();
  protected long mN;
  /** Construct the sequence. */
  public A219651() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA034968.next());
  }

}
