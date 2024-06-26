package irvine.oeis.a309;
// Generated by gen_seq4.pl 2024-01-25/triuple at 2024-01-26 22:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A309386 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals, where A(n,k) = Sum_{j=0..n} (-k)^(n-j)*Stirling2(n,j).
 * @author Georg Fischer
 */
public class A309386 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A309386() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n, j -> Functions.STIRLING2.z(n, j).multiply(Z.valueOf(-k).pow(n - j)));
  }
}
