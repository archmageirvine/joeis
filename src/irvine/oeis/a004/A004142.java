package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a001.A001047;

/**
 * A004142 n*(3^n-2^n).
 * @author Sean A. Irvine
 */
public class A004142 extends A001047 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
