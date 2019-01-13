package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014321.
 * @author Sean A. Irvine
 */
public class A014321 extends A014320 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

