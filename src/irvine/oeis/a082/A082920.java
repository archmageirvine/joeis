package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082920 Squares that are the sum of four factorials.
 * @author Sean A. Irvine
 */
public class A082920 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    Z f = Functions.FACTORIAL.z(mN);
    while (mA.isEmpty() || mA.first().compareTo(f) > 0) {
      for (long k = 0; k <= mN; ++k) {
        for (long j = 0; j <= k; ++j) {
          for (long i = 0; i <= j; ++i) {
            final Z s = f.add(Functions.FACTORIAL.z(k)).add(Functions.FACTORIAL.z(j)).add(Functions.FACTORIAL.z(i));
            if (s.isSquare()) {
              mA.add(s);
            }
          }
        }
      }
      f = Functions.FACTORIAL.z(++mN);
    }
    return mA.pollFirst();
  }
}
