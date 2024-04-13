package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052018 Numbers k with the property that the sum of the digits of k is a substring of k.
 * @author Sean A. Irvine
 */
public class A052018 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long sum = Functions.DIGIT_SUM.l(v);
      if (String.valueOf(mN).contains(String.valueOf(sum))) {
        return Z.valueOf(mN);
      }
    }
  }
}
