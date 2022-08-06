package irvine.oeis.a270;
// manually hygeom at 2022-08-05 08:42

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A270386 Expansion of (4/(3*x/(1-x))) * sin((1/3)*arcsin(sqrt(27*x/4/(1-x))))^2.
 * @author Georg Fischer
 */
public class A270386 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A270386() {
    super(0, 3, 2, "[[5/3],[7/3],[1,-1],[5/2],[3],[-27/4]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      return Z.ONE;
    } else {
      return super.nextQ().multiply(2).num();
    }
  }
}
