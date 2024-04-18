package irvine.oeis.a322;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A322324 Square array A(n,k), n &gt;= 1, k &gt;= 0, read by antidiagonals: A(n,k) = Product_{p|n, p prime} (1 - p^k).
 * A(n,k) = Sum_{d|n} mu(d)*d^k.
 * @author Georg Fischer
 */
public class A322324 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A322324() {
    super(1, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(k).multiply(Functions.MOBIUS.i((long) d)));
  }
}
