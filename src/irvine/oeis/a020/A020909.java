package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020909.
 * @author Sean A. Irvine
 */
public class A020909 extends A000045 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength());
  }
}
