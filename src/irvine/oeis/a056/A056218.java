package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056218 If n = p_1^a_1 * p_2^a_2 * p_3^a_3 * ..., where p_k is the k-th prime and the a's are nonnegative integers, then a(n) = n!/product_{k &gt;= 1} [(p_k)!^a_k].
 * @author Sean A. Irvine
 */
public class A056218 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z res = MemoryFactorial.SINGLETON.factorial(mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      res = res.divide(MemoryFactorial.SINGLETON.factorial(p).pow(e));
    }
    return res;
  }
}
