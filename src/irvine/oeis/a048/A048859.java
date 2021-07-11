package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001044;

/**
 * A048859 A sieve: keep the first 2 numbers, delete the next 3 numbers; keep the next 3 numbers, delete the next 4 numbers; keep the next 4 numbers, delete the next 5 numbers; and so on. In other words, keep the next k numbers and delete the next k+1 numbers, for k = 2, 3, ...
 * @author Sean A. Irvine
 */
public class A048859 extends A001044 {

  private long mN = 2;
  private long mM = 0;
  private long mK = 3;

  @Override
  public Z next() {
    if (--mK == 0) {
      mM += ++mN;
      mK = mN;
    }
    return Z.valueOf(++mM);
  }
}

