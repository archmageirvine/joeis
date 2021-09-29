package irvine.oeis.a192;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;

/**
 * A192755 Coefficient of x in the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined below in Comments.
 * @author Georg Fischer
 */
public class A192755 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A192755() {
    super(new A192754());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
