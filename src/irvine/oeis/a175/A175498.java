package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.HashSet;

/**
 * A175498.
 * @author Sean A. Irvine
 */
public class A175498 extends MemorySequence {

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
          final Z delta = s.subtract(get(size() - 1));
          boolean ok = true;
          for (int k = 1; k < size(); ++k) {
            if (get(k).subtract(get(k - 1)).equals(delta)) {
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

