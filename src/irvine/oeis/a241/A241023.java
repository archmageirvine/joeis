package irvine.oeis.a241;
// manually hygeom at 2022-08-05 09:45

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A241023 Central terms of the triangle in A102413.
 * @author Georg Fischer
 */
public class A241023 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A241023() {
    super(0, 2, 1, "[[1,-1],[1, 1],[1],[-1]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      return Z.ONE;
    } else {
      return super.nextQ().multiply(4).num();
    }
  }
}
