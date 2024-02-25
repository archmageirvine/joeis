package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A068574 As strings, n is a substring of Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A068574 extends Sequence1 {

  // 0 could be added to this sequence
  private final Sequence mF = new A000045().skip();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mF.next().toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
