package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064939 a(n) = Sum_{i=1..omega(n)} i*p_i, where {p_i}, i=1..omega(n) is the increasing sequence of prime divisors of n, where omega is the number of distinct prime factors of n (A001221).
 * @author Sean A. Irvine
 */
public class A064939 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(++mN).toZArray();
    return Integers.SINGLETON.sum(0, p.length - 1, k -> p[k].multiply(k + 1));
  }
}
