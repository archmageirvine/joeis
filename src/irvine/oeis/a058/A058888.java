package irvine.oeis.a058;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058888 Number of terms in the set invphi(2*p(n)), where p(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A058888 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(InverseEuler.inversePhi(super.next().multiply2()).size());
  }
}
