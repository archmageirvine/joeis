package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078838 a(n) = Sum_{k=1..(p-1)*(p-2)} floor((k*p)^(1/3)) where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A078838 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(3).subtract(5).multiply(p.subtract(2)).multiply(p.subtract(1)).divide(4);
  }
}
