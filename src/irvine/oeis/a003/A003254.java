package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005206;

/**
 * A003254.
 * @author Sean A. Irvine
 */
public class A003254 extends A003234 {

  private final A005206 mS = new A005206();

  private Z get(final int n) {
    while (n >= mS.size()) {
      mS.next();
    }
    return mS.get(n);
  }

  @Override
  public Z next() {
    final Z n = get(super.next().intValueExact());
    final Sequence s = new A003233();
    long m = 1;
    while (!s.next().equals(n)) {
      ++m;
    }
    return Z.valueOf(m);
  }

}
