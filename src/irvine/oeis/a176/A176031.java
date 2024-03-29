package irvine.oeis.a176;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007947;

/**
 * A176031 a(n) = n^rad(n).
 * @author Georg Fischer
 */
public class A176031 extends Sequence1 {

  final Sequence mA007947 = new A007947();
  protected long mN;
  /** Construct the sequence. */
  public A176031() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mA007947.next());
  }

}
