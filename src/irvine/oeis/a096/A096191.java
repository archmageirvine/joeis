package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.a000.A000172;

/**
 * A096191 a(n) = Sum_{k=1..n} C(n,k)^3 where C(n,k) is binomial(n,k).
 * @author Georg Fischer
 */
public class A096191 extends A000172 {

  /** Construct the sequence. */
  public A096191() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
