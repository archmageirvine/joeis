package irvine.oeis.a324;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A324658 a(n) = n - A324659(n), where A324659(n) is half of bitwise-AND of 2*n and sigma(n).
 * @author Georg Fischer
 */
public class A324658 extends Sequence1 {

  final Sequence mA324659 = new A324659();
  protected long mN;
  /** Construct the sequence. */
  public A324658() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA324659.next());
  }

}
