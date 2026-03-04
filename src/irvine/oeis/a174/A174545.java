package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A174545 A symmetrical triangle based on Stirling numbers of the second kind :q=2;t(n,m,q)=If[m == 0 Or m == n, 1, If[Floor[n/2] greater than or equal to m, StirlingS2[ n, m]*q^m, StirlingS2[n, n - m]*q^(n - m)]].
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A174545 extends LambdaTriangle {

  /** Construct the sequence. */
  public A174545() {
    super(0, 0, 0, (n, m) -> m == 0 || m.equals(n) ? Z.ONE : Functions.STIRLING2.z(n, Math.min(m, n - m)).shiftLeft(Math.min(m, n - m)));
  }
}
