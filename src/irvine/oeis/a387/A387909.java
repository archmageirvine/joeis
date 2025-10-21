package irvine.oeis.a387;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A387909 Consider the factorial base expansion of n, without leading zeros, say (d(1), ..., d(w)); for k = 2..floor(w/2), if d(k) &lt;= k then exchange d(k) and d(w+1-k); the resulting digits correspond to the factorial base expansion of a(n).
 * @author Sean A. Irvine
 */
public class A387909 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final ArrayList<Z> f = ZUtils.factorialBaseList(Z.valueOf(++mN));
    for (int k = 1; 2 * k < f.size(); ++k) {
      if (f.get(k).longValueExact() <= k + 1) {
        final Z t = f.get(k);
        f.set(k, f.get(f.size() - 1 - k));
        f.set(f.size() - 1 - k, t);
      }
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < f.size(); ++k) {
      sum = sum.add(f.get(f.size() - 1 - k).multiply(Functions.FACTORIAL.z(k + 1)));
    }
    return sum;
  }
}
