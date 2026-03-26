package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394431 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A394431 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    long best = 0;
    long bestB = 0;
    for (long b = 2; b < mN; ++b) {
      final long sum = Functions.DIGIT_SUM.l(b, mN);
      if (sum > best) {
        best = sum;
        bestB = b;
      }
    }
    return Z.valueOf(bestB);
  }
}
