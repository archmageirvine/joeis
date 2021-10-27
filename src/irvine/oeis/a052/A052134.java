package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052134 Numerators of coefficients in function a(x) such that a(a(a(x))) = sinh x.
 * @author Sean A. Irvine
 */
public class A052134 extends A052132 {

  private long mSign = -1;

  @Override
  public Z next() {
    mSign = -mSign;
    return super.next().multiply(mSign);
  }
}

