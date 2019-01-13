package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026507.
 * @author Sean A. Irvine
 */
public class A026507 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final Z t;
    if (size() == 0) {
      t = Z.ONE;
    } else {
      Z c = get(size() - 1);
      while (true) {
        c = c.add(1);
        boolean ok = true;
        out:
        for (int i = 0; i < size(); ++i) {
          final Z ai = get(i);
          for (int j = i + 1; j < size(); ++j) {
            final Z s = ai.add(get(j)).square();
            for (int k = j + 1; k < size(); ++k) {
              if (s.subtract(get(k).square()).equals(c)) {
                ok = false;
                break out;
              }
            }
          }
        }
        if (ok) {
          t = c;
          break;
        }
      }
    }
    return t;
  }
}

