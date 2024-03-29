package irvine.oeis.a053;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051953;

/**
 * A053650 Cototient function of n^2.
 * @author Georg Fischer
 */
public class A053650 extends Sequence1 {

  final Sequence mA051953 = new A051953();
  protected long mN;
  /** Construct the sequence. */
  public A053650() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA051953.next());
  }

}
