package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065373 Number of iterations of A065371 starting at n until 1 is reached.
 * @author Sean A. Irvine
 */
public class A065373 extends A065371 {

  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    int n = ++mN;
    while (n != 1) {
      n = a(n).intValueExact();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
