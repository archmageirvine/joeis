package irvine.oeis.a174;

import irvine.math.z.Binomial;
import irvine.oeis.a173.A173018;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A174966 Triangle read by rows: T(n,k) = binomial(n,k) + Eulerian1(n+1,k) - binomial(n,k) * Eulerian1(n+1,k).
 * @author Sean A. Irvine
 */
public class A174966 extends LambdaTriangle {

  private static final DirectArray A173018 = new A173018();

  /** Construct the sequence. */
  public A174966() {
    super(0, 0, 0, (n, m) -> Binomial.binomial(n, m).add(A173018.a(n + 1, m)).subtract(Binomial.binomial(n, m).multiply(A173018.a(n + 1, m))));
  }
}
