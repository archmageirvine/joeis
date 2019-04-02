package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001588 a(n) = a(n-1) + a(n-2) - 1.
 * @author Sean A. Irvine
 */
public class A001588 extends A000045 {

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
