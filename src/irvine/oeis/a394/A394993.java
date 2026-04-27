package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394993 a(n) = n! * Sum_{k=0..n} (-1)^(k+1)*F(k)/k!, where F(n) is the n-th Fibonacci number, A000045(n).
 * @author Sean A. Irvine
 */
public class A394993 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Z.NEG_ONE.pow(k + 1).multiply(Functions.FIBONACCI.z(k)).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k))));
  }
}
