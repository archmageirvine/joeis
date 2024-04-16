package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007539 a(n) = first n-fold perfect (or n-multiperfect) number.
 * @author Sean A. Irvine
 */
public class A007539 extends Sequence1 {

  // Only good for 4 terms or 5 if you wait for ages

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (!Functions.SIGMA.z(++k).equals(mN * k)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
