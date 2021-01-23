package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000312 a(n) = n^n; number of labeled mappings from n points to themselves (endofunctions).
 * @author Sean A. Irvine
 */
public class A000312 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN);
  }
}
