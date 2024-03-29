package irvine.oeis.a080;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006450;

/**
 * A080697 a(n) = n * prime(prime(n)).
 * @author Georg Fischer
 */
public class A080697 extends Sequence1 {

  final Sequence mA006450 = new A006450();
  protected long mN;
  /** Construct the sequence. */
  public A080697() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA006450.next());
  }

}
