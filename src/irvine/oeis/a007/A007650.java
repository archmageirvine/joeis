package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007650 Number of set-like atomic species of degree <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007650 extends A007649 {

  @Override
  public Z next() {
    super.next();
    return mA.get(mA.size() - 1);
  }
}
