package irvine.oeis.a102;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005918;

/**
 * A102853 Number of prime factors (with multiplicity) of number of points on surface of square pyramid.
 * @author Georg Fischer
 */
public class A102853 extends A005918 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Functions.BIG_OMEGA.z(super.next());
    return (++mN == 0) ? Z.ONE : t;
  }
}
