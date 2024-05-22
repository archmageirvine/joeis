package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A067819 Sum of the divisors of binomial(2n,n).
 * @author Georg Fischer
 */
public class A067819 extends A000984 {

  /** Construct the sequence. */
  public A067819() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
