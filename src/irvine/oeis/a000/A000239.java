package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000239.
 * @author Sean A. Irvine
 */
public class A000239 extends A000130 {

  /** Construct the sequence. */
  public A000239() {
    super.next();
  }

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(super.next());
    return mS.max(Z.ONE);
  }
}
