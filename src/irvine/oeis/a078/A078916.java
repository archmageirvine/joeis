package irvine.oeis.a078;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014688;

/**
 * A078916 a(n) = prime(n) + 2*n.
 * @author Georg Fischer
 */
public class A078916 extends Sequence1 {

  final Sequence mA014688 = new A014688();
  protected long mN;
  /** Construct the sequence. */
  public A078916() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA014688.next().add(Z.valueOf(mN));
  }

}
