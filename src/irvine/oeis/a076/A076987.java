package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076987 Smallest triangular number of the form n*k + 1 with k&gt;0.
 * @author Sean A. Irvine
 */
public class A076987 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++k);
      if (t.mod(mN) == 1 % mN) {
        return t;
      }
    }
  }
}

