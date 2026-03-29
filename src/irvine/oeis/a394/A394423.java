package irvine.oeis.a394;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;

/**
 * A394059.
 * @author Sean A. Irvine
 */
public class A394423 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final long[] v = new long[2 * ++mN + 1];
    final Sequence gaps = new A001223();
    for (int j = 0; j < v.length; ++j) {
      v[j] = gaps.next().longValueExact();
    }
    long k = 1;
    while (!LongUtils.isPalindrome(v)) {
      System.arraycopy(v, 1, v, 0, v.length - 1);
      v[v.length - 1] = gaps.next().longValueExact();
      ++k;
    }
    //System.out.println(Arrays.toString(v));
    return Z.valueOf(k);
  }
}
