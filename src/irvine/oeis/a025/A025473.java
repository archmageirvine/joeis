package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A025473 <code>a(1) = 1;</code> for <code>n &gt; 1, a(n) =</code> prime root of n-th prime power <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A025473 extends A000961 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    final Z[] p = mFactor.factorize(super.next()).toZArray();
    return p.length == 0 ? Z.ONE : p[0];
  }
}

