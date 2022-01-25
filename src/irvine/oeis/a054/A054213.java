package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054213 Smallest fifth powers whose decimal expansion digits occur with same frequency n.
 * @author Sean A. Irvine
 */
public class A054213 extends A054212 {

  @Override
  public Z next() {
    return super.next().pow(5);
  }
}

