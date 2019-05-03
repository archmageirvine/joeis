package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000312 <code>a(n) = n^n</code>; number of labeled mappings from n points to themselves <code>(endofunctions)</code>.
 * @author Sean A. Irvine
 */
public class A000312 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN);
  }
}
