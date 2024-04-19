package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009470 a(n) is the concatenation of n and 8n.
 * @author Sean A. Irvine
 */
public class A009470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + 8 * mN);
  }
}
