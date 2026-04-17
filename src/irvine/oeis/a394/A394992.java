package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394992 allocated for Hans J. H. Tuenter.
 * @author Sean A. Irvine
 */
public class A394992 extends Sequence0 {

  // a(n) = n! * Sum_{k=0..n} F(2*k)/k!, where F(n) is the n-th Fibonacci number, A000045(n).

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.FIBONACCI.z(2 * k).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k))));
  }
}
