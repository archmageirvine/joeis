package irvine.oeis.a157;
// Generated by gen_seq4.pl eulerp at 2021-02-05 23:01
// DO NOT EDIT here!

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;


/**
 * A157027 Denominator of Euler(n, 1/26).
 * @author Georg Fischer
 */
public class A157027 extends Sequence0 {

  private int mN = -1;
  private final Q mFract = new Q(1, 26);

  @Override
  public Z next() {
    ++mN;
    return EulerPolynomials.eval(mN, mFract).den();
  }
}
