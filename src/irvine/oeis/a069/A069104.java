package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A069104 Numbers m such that m divides Fibonacci(m+1).
 * @author Sean A. Irvine
 */
public class A069104 extends Sequence1 {

  private final Sequence mF = new A000045().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mF.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

