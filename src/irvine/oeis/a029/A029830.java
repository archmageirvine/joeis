package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a013.A013967;

/**
 * A029830 Eisenstein series E_20(q) (alternate convention E_10(q)), multiplied by 174611.
 * @author Sean A. Irvine
 */
public class A029830 extends A013967 {

  /** Construct the sequence. */
  public A029830() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(174611);
    }
    return super.next().multiply(13200);
  }
}
