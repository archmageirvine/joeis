package irvine.oeis.a167;
// manually 2021-09-01

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A167745 Integer values of Fibonacci(n)/n.
 * @author Georg Fischer
 */
public class A167745 extends A000045 {

  {
    setOffset(1);
  }

  protected long mN;

  /** Construct the sequence. */
  public A167745() {
    mN = 0;
    super.next(); // skip a(0)
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z[] quot = super.next().divideAndRemainder(Z.valueOf(mN));
      if (quot[1].isZero()) {
        return quot[0];
      }
    }
  }
}
