package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000051;

/**
 * A054992 Number of prime factors of 2^n + 1 (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A054992 extends A000051 {

  /** Construct the sequence. */
  public A054992() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
