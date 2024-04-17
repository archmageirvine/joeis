package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A046460 Number of prime factors of concatenation of numbers from 1 up to n, with multiplicity.
 * @author Sean A. Irvine
 */
public class A046460 extends A007908 {

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
