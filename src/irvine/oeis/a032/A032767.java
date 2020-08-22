package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032767 a(n) = floor ( n(n+1)(n+2)(n+3) / (n+(n+1)+(n+2)+(n+3)) ).
 * @author Sean A. Irvine
 */
public class A032767 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).divide(4 * mN + 6);
  }
}
