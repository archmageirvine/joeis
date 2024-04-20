package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000073;

/**
 * A366583 a(2) = a(3) = 1; for n &gt;3, a(n) = smallest prime factor of n-th Tribonacci number.
 * @author Sean A. Irvine
 */
public class A366583 extends A000073 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}

