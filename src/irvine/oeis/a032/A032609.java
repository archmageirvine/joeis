package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032609 Concatenation of n and n + 4 or {n,n+4}.
 * @author Sean A. Irvine
 */
public class A032609 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 4));
  }
}
