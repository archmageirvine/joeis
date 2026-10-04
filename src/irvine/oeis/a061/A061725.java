package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061725 a(n) = p^2 + 2 where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A061725 extends A000040 {

  @Override
  public Z next() {
    return super.next().square().add(2);
  }
}
