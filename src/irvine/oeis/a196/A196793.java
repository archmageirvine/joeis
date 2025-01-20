package irvine.oeis.a196;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A196793 a(n) = A047848(n, n).
 * a(n) = ((n+3)^n+n+1)/(n+2).
 * @author Georg Fischer
 */
public class A196793 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 3).pow(mN).add(mN + 1).divide(mN + 2);
  }
}
