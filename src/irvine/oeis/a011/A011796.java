package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a051.A051168;

/**
 * A011796 Number of irreducible alternating Euler sums of depth 6 and weight <code>6+2n</code>.
 * @author Sean A. Irvine
 */
public class A011796 extends A051168 {

  private long mN = 6;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}
