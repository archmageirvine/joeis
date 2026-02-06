package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a001.A001831;

/**
 * A391878 The number of vacuously transitive relations on an n-set.
 * @author Sean A. Irvine
 */
public class A391878 extends A001831 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

