package irvine.oeis.a325;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048146;

/**
 * A325814 a(n) = n - A048146(n), where A048146 is the sum of non-unitary divisors of n.
 * @author Georg Fischer
 */
public class A325814 extends Sequence1 {

  final Sequence mA048146 = new A048146();
  protected long mN;
  /** Construct the sequence. */
  public A325814() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA048146.next());
  }

}
