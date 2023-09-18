package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065883 Remove factors of 4 from n (i.e., write n in base 4, drop final zeros, then rewrite in decimal).
 * @author Sean A. Irvine
 */
public class A065883 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while ((m & 3) == 0) {
      m >>>= 2;
    }
    return Z.valueOf(m);
  }
}
