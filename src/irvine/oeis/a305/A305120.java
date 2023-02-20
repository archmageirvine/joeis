package irvine.oeis.a305;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a006.A006128;
import irvine.oeis.transform.RootSequence;

/**
 * A305120 G.f.: (Sum_{k&gt;=1} x^k/(1-x^k) * Product_{k&gt;=1} 1/(1-x^k) )^2.
 * .
 * @author Georg Fischer
 */
public class A305120 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A305120() {
    super(0, new SkipSequence(new A006128(), 2), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
