package irvine.oeis.a062;
// Generated by gen_seq4.pl build/simple at 2022-06-14 21:39

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062812 a(n) = Sum_{i=1..n} i^(n - i) + (-1)^(n - i)*(n - i)^i.
 * @author Georg Fischer
 */
public class A062812 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, i -> Z.valueOf(i).pow(mN - i).add((Z.NEG_ONE.pow(mN - i)).multiply(Z.valueOf(mN - i).pow(i))));
  }
}
