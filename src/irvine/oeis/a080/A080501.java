package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080501 Let f(n) be the smallest multiple of n that can be obtained by inserting digits anywhere in n except that f(n) is not equal to 10*n; a(n) = f(n)/n.
 * @author Sean A. Irvine
 */
public class A080501 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long k = 1;
    while (true) {
      t = t.add(mN);
      if (++k != 10 && A080471.is(t, mN)) {
        return Z.valueOf(k);
      }
    }
  }
}

