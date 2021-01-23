package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032613 Concatenation of n and n + 8 or {n,n+8}.
 * @author Sean A. Irvine
 */
public class A032613 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 8));
  }
}
