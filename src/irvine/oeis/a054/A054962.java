package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054962 Number of different solutions to problem in A054961.
 * @author Sean A. Irvine
 */
public class A054962 extends A054961 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMaxCount);
  }
}
