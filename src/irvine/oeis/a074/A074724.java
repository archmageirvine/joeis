package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074724 Highest power of 3 dividing F(4n) where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074724 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    return Z.THREE.pow(Functions.VALUATION.l(Functions.FIBONACCI.z(mN), 3));
  }
}
