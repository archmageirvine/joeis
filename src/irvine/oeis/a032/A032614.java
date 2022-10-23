package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032614 Concatenation of n and n + 9 or {n,n+9}.
 * @author Sean A. Irvine
 */
public class A032614 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 9));
  }
}
