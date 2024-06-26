package irvine.oeis.a249;
// manually sigman0/sigma0 at 2023-02-28 16:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002488;

/**
 * A249784 Number of divisors of n^(n^n).
 * @author Georg Fischer
 */
public class A249784 extends A002488 {

  /** Construct the sequence. */
  public A249784() {
    super(1);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
