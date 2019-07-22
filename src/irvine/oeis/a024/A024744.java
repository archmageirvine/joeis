package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024744.
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
