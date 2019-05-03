package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000602;

/**
 * A010372 Number of unrooted quartic trees with <code>n</code> (unlabeled) nodes and possessing a centroid; number of n-carbon alkanes <code>C(n)H(2n +2)</code> with a centroid ignoring stereoisomers.
 * @author Sean A. Irvine
 */
public class A010372 extends A000602 {

  private final A010373 mA = new A010373();
  private boolean mOdd = false;

  {
    super.next();
  }

  @Override
  public Z next() {
    mOdd = !mOdd;
    return mOdd ? super.next() : super.next().subtract(mA.next());
  }
}
