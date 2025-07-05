package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078563 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence gaps = new A001223();
    Z t = gaps.next();
    long k = 1;
    while (true) {
      ++k;
      final Z u = t;
      t = gaps.next();
      if (t.equals(u.multiply(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}

