package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085227 Column 0 of A085205.
 * @author Sean A. Irvine
 */
public class A085227 extends A085205 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(0, ++mN);
  }
}
