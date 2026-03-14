package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.a173.A173018;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A174791 A symmetrical triangular sequence:t(n,m)=(n!^2/(m!(n - m)!))*Eulerian[n + 1, m] - (n!^2/(m!(n - m)!)) + 1.
 * @author Sean A. Irvine
 */
public class A174791 extends LambdaTriangle {

  private static final DirectArray A173018 = new A173018();

  /** Construct the sequence. */
  public A174791() {
    super(0, 0, 0, (n, k) -> Functions.FACTORIAL.z(n).multiply(Binomial.binomial(n, k)).multiply(A173018.a(n + 1, k).subtract(1)).add(1));
  }
}
