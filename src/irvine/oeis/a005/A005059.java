package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005059 <code>a(n) = (5^n - 3^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A005059 extends A005058 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

