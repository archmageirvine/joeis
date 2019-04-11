package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000912 Expansion of <code>(sqrt(1-4x^2) - sqrt(1-4x))/(2x)</code>.
 * @author Sean A. Irvine
 */
public class A000912 extends A000150 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      super.next();
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}

