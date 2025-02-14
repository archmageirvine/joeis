package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a001.A001597;

/**
 * A070428 Number of perfect powers (A001597) not exceeding 10^n.
 * @author Sean A. Irvine
 */
public class A075309 extends A001597 {

  private static final Z LAST = Z.valueOf(9814072356L);

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(LAST) > 0) {
        return null;
      }
      if (Functions.MAX.i(ZUtils.digitCounts(t)) <= 1) {
        return t;
      }
    }
  }
}
