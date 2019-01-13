package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005059.
 * @author Sean A. Irvine
 */
public class A005059 extends A005058 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

