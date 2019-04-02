package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a214.A214823;

/**
 * A215017 Number of genus 3 unsensed hypermaps with n darts.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A215017 extends A214823 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(hypermapCount(2, ++mN, 1, mN + 1, false)[3]);
  }
}
