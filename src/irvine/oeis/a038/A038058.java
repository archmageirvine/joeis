package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038058 Number of labeled trees with 2-colored nodes.
 * @author Sean A. Irvine
 */
public class A038058 extends A038057 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().divide(mN);
  }
}
