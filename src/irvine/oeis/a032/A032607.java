package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032607 Concatenation of n and n + 2 or {n,n+2}.
 * @author Sean A. Irvine
 */
public class A032607 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 2));
  }
}
