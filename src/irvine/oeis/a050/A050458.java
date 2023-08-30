package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a002.A002173;

/**
 * A050458 Difference between Sum_{d|n, d == 1 (mod 4)} d^2 and Sum_{d|n, d == 3 (mod 4)} d^2.
 * @author Sean A. Irvine
 */
public class A050458 extends A002173 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
