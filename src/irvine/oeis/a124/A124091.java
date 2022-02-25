package irvine.oeis.a124;
// manually 2022-02-25

import irvine.math.z.Z;
import irvine.oeis.a084.A084119;

/**
 * A124091 Decimal expansion of Fibonacci binary constant: Sum{i&gt;=0} (1/2)^Fibonacci(i).
 * @author Georg Fischer
 */
public class A124091 extends A084119 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return super.next().add(1);
    }
    return super.next();
  }
}
