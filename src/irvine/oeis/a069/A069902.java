package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;


/**
 * A069902 Largest prime factor of n(n+1)/2, the n-th triangular number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A069902 extends A000217 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}
