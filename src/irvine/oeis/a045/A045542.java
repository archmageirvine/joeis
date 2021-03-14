package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A045542 Sub-perfect powers: perfect powers (squares, cubes etc.) minus 1.
 * @author Sean A. Irvine
 */
public class A045542 extends A001597 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
