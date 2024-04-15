package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a027.A027423;

/**
 * A053021 Number of divisors function applied twice to n!.
 * @author Sean A. Irvine
 */
public class A053021 extends A027423 {

  /** Construct the sequence. */
  public A053021() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
