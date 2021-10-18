package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052045 Cubes lacking the digit zero in their decimal expansion.
 * @author Sean A. Irvine
 */
public class A052045 extends A052044 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

