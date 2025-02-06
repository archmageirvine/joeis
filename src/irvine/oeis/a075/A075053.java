package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075053 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long cnt = 0;
    for (long k = 1; k < 1L << s.length(); ++k) {
      final int len = Long.bitCount(k);
      final int[] a = new int[len];
      for (int j = 0, i = 0; j < len; ++i) {
        if ((k & (1L << i)) != 0) {
          a[j++] = s.charAt(i) - '0';
        }
      }
      final Permutation perm = new Permutation(a);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0 && Permutation.permToZ(p).isProbablePrime()) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
