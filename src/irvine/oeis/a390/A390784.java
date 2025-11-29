package irvine.oeis.a390;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a219.A219180;

/**
 * A390784 a(n) is the number of positive integers k for which Sum_{i=1..r} p_i = Sum_{i=1..r} e_i = n, where p_1^e_1*...*p_r^e_r is the canonical prime factorization of k.
 * @author Sean A. Irvine
 */
public class A390784 extends Sequence1 {

  private final A219180 mT = new A219180();
  {
    mT.nextRow(); // skip row 0
  }
  private int mN = -1; // offset by 1 to avoid -1 in binomial

  @Override
  public Z next() {
    ++mN;
    final Z[] t = mT.nextRow();
    return Integers.SINGLETON.sum(1, t.length - 1, k -> t[k].multiply(Binomial.binomial(mN, k - 1)));
  }
}
