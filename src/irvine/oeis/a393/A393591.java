package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393591 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A393591 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long b = 2;
    long s = Functions.DIGIT_SUM.l(b, mN);
    while (true) {
      final long t = Functions.DIGIT_SUM.l(++b, mN);
      if (t <= s) {
        return Z.valueOf(b - 1);
      }
      s = t;
    }
  }
}
