package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A366954 The sum of the divisors of the concatenation of 1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A366954 extends A007908 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
