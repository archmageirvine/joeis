package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a392.A392092;

/**
 * A394060 a(n+1) = a(n) + 2*d(a(n)) if s(a(n)) &lt;= a(n), else 2*a(n) - s(a(n)), with a(1) = 1; d(k) is the number of divisors of k A000005 and s(k) is the aliquot sum of k A001065.
 * @author Sean A. Irvine
 */
public class A394060 extends A392092 {

  /** Construct the sequence. */
  public A394060() {
    super(Z.ONE);
  }
}
