package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002500.
 * @author Sean A. Irvine
 */
public class A002500 extends A002499 {

  private boolean mFirst = true;
  
  private int sum3(final int[] j) {
    int s = 0;
    for (final int q : j) {
      s += q;
    }
    return s;
  }

  @Override
  protected int epsilon(final int p, final int[] j) {
    return super.epsilon(p, j) + sum3(j);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}
