package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A024899 Numbers k such that 6*k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A024899 extends A002476 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
