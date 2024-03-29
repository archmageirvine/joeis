package irvine.oeis.a085;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a016.A016754;

/**
 * A085530 a(n) = (2n+1)^(2n).
 * @author Georg Fischer
 */
public class A085530 extends Sequence0 {

  final Sequence mA016754 = new A016754();
  protected long mN;
  /** Construct the sequence. */
  public A085530() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA016754.next().pow(Z.valueOf(mN));
  }

}
