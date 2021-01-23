package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a007.A007814;

/**
 * A037227 If n = 2^m*k, k odd, then a(n) = 2*m+1.
 * @author Sean A. Irvine
 */
public class A037227 extends A007814 {

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
