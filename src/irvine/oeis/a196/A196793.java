package irvine.oeis.a196;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A196793 a(n) = T(n,n), array T given by A047848.
 * a(n) = ((n+3)^n+n+1)/(n+2).
 * @author Georg Fischer
 */
public class A196793 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 3).pow(mN).add(mN + 1).divide(mN + 2);
  }
}
