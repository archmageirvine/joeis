package irvine.oeis.a046;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A046805 If n=sum a_i b_i, (a_i,b_i positive integers) then a(n)=max value of min(all a_i and b_i).
 * @author Sean A. Irvine
 */
public class A046805 extends MemorySequence {

  // After Robert Israel

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int s = IntegerUtils.sqrt(n);
    if (s * s == n) {
      return Z.valueOf(s);
    }
    int vMax = 1;
    for (int a = s; a > vMax; --a) {
      for (int b = a; b <= n / a; ++b) {
        final Z t = get(n - a * b);
        final int v = t == null ? a : Math.min(a, t.intValueExact());
        if (v > vMax) {
          vMax = v;
        }
      }
    }
    return Z.valueOf(vMax);
  }
}
