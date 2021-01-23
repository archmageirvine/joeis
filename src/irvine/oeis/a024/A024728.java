package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024728 a(n) = A024727(n+3)/4.
 * @author Sean A. Irvine
 */
public class A024728 extends A024727 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
