package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393569 allocated for Maximiliano Nicol\u00e1s Cardich.
 * @author Sean A. Irvine
 */
public class A393569 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  /* Perform one step of the merging, modifying array in place, and returning new length. */
  private int step(final int[] v, final int end) {
    int s = 0;
    boolean state = mPrime.isPrime(v[0]);
    int j = 0;
    for (int k = 0; k < end; ++k) {
      final int vk = v[k];
      if (state != mPrime.isPrime(vk)) {
        state = !state;
        v[j++] = s;
        s = 0;
      }
      s += vk;
    }
    v[j++] = s;
    return j;
  }

  @Override
  public Z next() {
    final int[] v = IntegerUtils.identity1(new int[++mN]);
    int cnt = -1;
    int t = 0;
    int m = v.length;
    while (m != t) {
      ++cnt;
      t = m;
      m = step(v, m);
    }
    return Z.valueOf(cnt);
  }
}
