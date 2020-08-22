package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032611 Concatenation of n and n + 6 or {n,n+6}.
 * @author Sean A. Irvine
 */
public class A032611 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 6));
  }
}
