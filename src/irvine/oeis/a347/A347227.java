package irvine.oeis.a347;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A347227 Square array T(n,k), n &gt;= 1, k &gt;= 0, read by antidiagonals downwards, where T(n,k) = Sum_{d|n} mu(d)*mu(n/d)*d^k.
 * @author Georg Fischer
 */
public class A347227 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A347227() {
    super(1, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(k).multiply(Mobius.mobius(d)).multiply(Mobius.mobius(n / d)));
  }
}
