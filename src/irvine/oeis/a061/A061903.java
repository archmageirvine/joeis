package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061903 Number of distinct elements of the iterative cycle: n -&gt; sum of digits of n^2.
 * @author Sean A. Irvine
 */
public class A061903 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    final HashSet<Long> seen = new HashSet<>();
    while (true) {
      t = Functions.DIGIT_SUM.l(t * t);
      if (!seen.add(t)) {
        return Z.valueOf(seen.size());
      }
    }
  }
}

