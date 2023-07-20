package irvine.oeis.a175;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A175498 a(1)=1. a(n) = the smallest positive integer not occurring earlier such that a(n)-a(n-1) doesn't equal a(k)-a(k-1) for any k with 2 &lt;= k &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A175498 extends MemorySequence {

  {
    setOffset(1);
  }

  private final HashSet<Z> mUsed = new HashSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      mUsed.add(Z.ONE);
      return Z.ONE;
    } else {
      Z s = Z.TWO;
      while (true) {
        if (!mUsed.contains(s)) {
          final Z delta = s.subtract(a(size() - 1));
          boolean ok = true;
          for (int k = 1; k < size(); ++k) {
            if (a(k).subtract(a(k - 1)).equals(delta)) {
              ok = false;
              break;
            }
          }
          if (ok) {
            mUsed.add(s);
            return s;
          }
        }
        s = s.add(1);
      }
    }
  }
}

