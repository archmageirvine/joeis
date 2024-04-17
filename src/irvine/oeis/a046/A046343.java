package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A046343 Sum of the prime factors of the composite numbers (counted with multiplicity).
 * Formula: <code>a(n) = A001414(A002808(n)).</code>
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A046343 extends A002808 {

  @Override
  public Z next() {
    return Functions.SOPFR.z(super.next());
  }
}
