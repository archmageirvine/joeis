package irvine.oeis.a180;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a015.A015910;

/**
 * A180060 a(n) = 2^(2^n mod n) mod n.
 * @author Georg Fischer
 */
public class A180060 extends Sequence1 {

  final Sequence mA015910 = new A015910();
  protected long mN;
  /** Construct the sequence. */
  public A180060() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.pow(mA015910.next()).mod(Z.valueOf(mN));
  }

}
