package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A167893 <code>a(n) = Sum_{k=1..n}</code> Catalan(k)^3.
 * @author Sean A. Irvine
 */
public class A167893 extends A000108 {

  private Z mS = Z.ZERO;

  {
    super.next();
  }

  @Override
  public Z next() {
    mS = mS.add(super.next().pow(3));
    return mS;
  }
}

