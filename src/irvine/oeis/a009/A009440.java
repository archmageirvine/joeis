package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009440 a(n) is the concatenation of n and 6n.
 * @author Sean A. Irvine
 */
public class A009440 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + String.valueOf(6 * mN));
  }
}
