package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A050491 a(n) = C(n)*(12n+1) where C(n)=Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A050491 extends A000108 {

  @Override
  public Z next() {
    return super.next().multiply(12 * mN + 1);
  }
}
