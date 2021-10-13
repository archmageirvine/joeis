package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051892 Values of e, the lesser key or generating number for Pythagorean triangles in which S (the odd short leg) and U (the hypotenuse) are twin primes.
 * @author Sean A. Irvine
 */
public class A051892 extends A051891 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
