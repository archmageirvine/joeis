package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024525 1^2+prime(1)^2+prime(2)^2+...+prime(n)^2.
 * @author Sean A. Irvine
 */
public class A024525 extends A024450 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(1);
  }
}
