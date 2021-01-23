package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002092 From a Goldbach conjecture: records in A185091.
 * @author Sean A. Irvine
 */
public class A002092 extends A002091 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mResQ);
  }
}
