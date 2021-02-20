package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a016.A016115;

/**
 * A040025 Number of prime palindromes with 2n+1 digits.
 * @author Sean A. Irvine
 */
public class A040025 extends A016115 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}
