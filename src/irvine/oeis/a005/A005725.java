package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008287;

/**
 * A005725.
 * @author Sean A. Irvine
 */
public class A005725 extends A008287 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return quadrinomial(mN, mN);
  }
}

