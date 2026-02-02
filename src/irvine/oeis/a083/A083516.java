package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083516 Smallest palindromic multiple of 11, sum of whose digits at some stage is equal to n.
 * @author Sean A. Irvine
 */
public class A083516 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence palin = new A002113().skip(10);
    while (true) {
      final Z p = palin.next();
      if (p.mod(11) == 0) {
        long sd = Functions.DIGIT_SUM.l(p);
        while (sd > mN && sd >= 10) {
          sd = Functions.DIGIT_SUM.l(sd);
        }
        if (sd == mN) {
          return p;
        }
      }
    }
  }
}

