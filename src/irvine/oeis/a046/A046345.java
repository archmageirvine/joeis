package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a032.A032350;

/**
 * A046345 Sum of the prime factors of the palindromic composite numbers (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046345 extends A032350 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SOPFR.z(super.next());
  }
}
