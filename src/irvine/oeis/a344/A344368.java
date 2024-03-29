package irvine.oeis.a344;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001055;

/**
 * A344368 Dirichlet g.f.: Product_{k&gt;=2} 1 / (1 - k^(1-s)).
 * @author Georg Fischer
 */
public class A344368 extends Sequence1 {

  final Sequence mA001055 = new A001055();
  protected long mN;
  /** Construct the sequence. */
  public A344368() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA001055.next());
  }

}
