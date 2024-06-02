package irvine.oeis.a070;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070073 Number of distinct cuboids with integer sides &lt;= n and cubefree volume.
 * @author Sean A. Irvine
 */
public class A070073 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        for (long i = 1; i <= j; ++i) {
          if (Predicates.CUBE_FREE.is(k * j * i)) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
