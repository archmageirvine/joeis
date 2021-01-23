package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034701 a(n) is the smallest number not of the form a(i) (1&lt;=i&lt;=n-1) or a(i)+a(n-1) (1&lt;=i&lt;=n-2).
 * @author Sean A. Irvine
 */
public class A034701 extends MemorySequence {

  @Override
  protected Z computeNext() {
    Z n = Z.ZERO;
    outer:
    while (true) {
      n = n.add(1);
      if (!contains(n)) {
        if (!isEmpty()) {
          final Z prev = get(size() - 1);
          for (int k = 0; k < size() - 1; ++k) {
            if (prev.add(get(k)).equals(n)) {
              continue outer;
            }
          }
        }
        return n;
      }
    }
  }
}

