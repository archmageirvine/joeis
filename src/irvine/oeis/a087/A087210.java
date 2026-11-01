package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A087210 Numbers k such that k^2 can be expressed as x^3 + y^4 with positive integers x,y and gcd(k,x,y)=1.
 * @author Sean A. Irvine
 */
public class A087210 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A087210() {
    super(1, 1, 1, (x, y) -> Z.valueOf(x).pow(3).add(Z.valueOf(y).pow(4)));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return super.accept(x, y, n, prev) && Predicates.SQUARE.is(n) && Functions.GCD.z(n, Z.valueOf(x), Z.valueOf(y)).isOne();
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
