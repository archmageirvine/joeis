package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A034701 a(n) is the smallest number not of the form a(i) (1&lt;=i&lt;=n-1) or a(i)+a(n-1) (1&lt;=i&lt;=n-2).
 * @author Sean A. Irvine
 */
public class A034701 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    Z n = Z.ZERO;
    outer:
    while (true) {
      n = n.add(1);
      if (!toList().contains(n)) {
        if (!(size() == 0)) {
          final Z prev = a(size() - 1);
          for (int k = 0; k < size() - 1; ++k) {
            if (prev.add(a(k)).equals(n)) {
              continue outer;
            }
          }
        }
        return n;
      }
    }
  }
}

