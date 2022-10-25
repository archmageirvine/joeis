package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A055224 a(1) = 1, a(n) = number of a(k) with 1 &lt;= k &lt;= n-1 such that a(k) divides a(n-k).
 * @author Sean A. Irvine
 */
public class A055224 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    for (int k = 0; k < size(); ++k) {
      if (a(size() - k - 1).mod(a(k)).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
