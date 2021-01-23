package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032610 Concatenation of n and n + 5 or {n,n+5}.
 * @author Sean A. Irvine
 */
public class A032610 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 5));
  }
}
