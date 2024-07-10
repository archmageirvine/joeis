package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a013.A013989;


/**
 * A000085 Number of self-inverse permutations on n letters, also known as involutions; number of standard Young tableaux with n cells.
 * @author Sean A. Irvine
 */
public class A000085 extends A013989 implements DirectSequence {

  @Override
  public Z next() {
    return super.next().divide(mN + 1);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(n) = Sum_{k=0..floor(n/2)} n!/((n-2*k)!*2^k*k!).
    return Integers.SINGLETON.sum(0, n / 2,
      k -> Functions.FACTORIAL.z(n).divide(Z.ONE.shiftLeft(k).multiply(Functions.FACTORIAL.z(k))
        .multiply(Functions.FACTORIAL.z(n - 2 * k))));
  }

}

