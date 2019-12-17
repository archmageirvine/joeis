package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028253 <code>n mod Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A028253 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 5) {
      return mN == 3 || mN == 4 ? Z.ONE : Z.ZERO;
    }
    return Z.valueOf(mN);
  }
}
