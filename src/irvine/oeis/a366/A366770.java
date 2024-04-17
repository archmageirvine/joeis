package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001045;

/**
 * A366770 Number of prime factors of A001045(n) (Jacobsthal numbers) (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A366770 extends A001045 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
