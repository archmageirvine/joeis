package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A175465 <code>a(n)</code> is the number of elements in the largest set of <code>same-sized run-lengths (of</code> either <code>0</code>'s or <code>1's)</code> in the binary representation of n.
 * @author Sean A. Irvine
 */
public class A175465 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    final int[] rl = new int[s.length()];
    char p = '2';
    int l = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (p == s.charAt(k)) {
        ++l;
      } else {
        if (l > 0) {
          rl[l - 1]++;
        }
        l = 1;
        p = s.charAt(k);
      }
    }
    rl[l - 1]++;
    int m = 0;
    for (final int v : rl) {
      if (v > m) {
        m = v;
      }
    }
    return Z.valueOf(m);
  }
}

