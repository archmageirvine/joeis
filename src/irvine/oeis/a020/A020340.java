package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020340 Least square base n doublet (written in base 10).
 * @author Sean A. Irvine
 */
public class A020340 extends A020339 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
