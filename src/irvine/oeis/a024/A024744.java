package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024744 <code>a(n) = s(n+3)/6</code>, where s is <code>A024743</code>.
 * @author Sean A. Irvine
 */
public class A024744 extends A024743 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
