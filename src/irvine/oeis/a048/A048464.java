package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a047.A047844;

/**
 * A048464 Indices of primefree generations.
 * @author Sean A. Irvine
 */
public class A048464 extends A047844 {

  private long mN = 8;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      Z t;
      long m = 0;
      while (m <= mN) {
        t = get(++m, mN);
        if (t.isProbablePrime()) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
