package irvine.oeis.a080;
// manually rootet 2023-03-14

import irvine.math.z.Z;
import irvine.oeis.a003.A003849;
import irvine.oeis.transform.RootSequence;

/**
 * A080844 G.f. is F^2, where F is g.f. for Fibonacci word (A003849).
 * @author Georg Fischer
 */
public class A080844 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A080844() {
    super(0, new A003849().skip(2), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
