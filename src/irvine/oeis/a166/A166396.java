package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A166396 <code>a(n) =</code> the number of distinct positive decimal values k of substrings in the binary representation of n where <code>k+1</code> is also the value of at least one substring in the binary representation of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A166396 implements Sequence {

  private long mN = 0;

  protected int start() {
    return 1;
  }

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 2);
    long c = 0;
    for (long k = start(); k < mN; ++k) {
      if (s.contains(Long.toString(k, 2)) && s.contains(Long.toString(k + 1, 2))) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

