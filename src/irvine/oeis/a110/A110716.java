package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A110716 Beginning with 3, concatenation of n successive numbers such that every partial concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A110716 extends Sequence1 {

  private int mN = 0;
  private String mS = initial();
  protected Z mZ = new Z(mS);

  protected String initial() {
    return "3";
  }

  private String chain(long n, final int m) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < m; ++k) {
      sb.append(n++);
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return mZ;
    }
    long b = 0;
    while (true) {
      final String w = chain(++b, mN);
      final String t = mS + w;
      final Z z = new Z(t);
      if (z.isProbablePrime(30)) {
        mS = t;
        mZ = z;
        return new Z(w);
      }
    }
  }
}

