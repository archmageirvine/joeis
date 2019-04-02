package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007778 a(n) = n^(n+1).
 * @author Sean A. Irvine
 */
public class A007778 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1);
  }
}
