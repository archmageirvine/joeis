package irvine.oeis.a291;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A291804 <code>a(n) = sigma(A291789(n))</code>.
 * @author Sean A. Irvine
 */
public class A291804 extends A291789 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
