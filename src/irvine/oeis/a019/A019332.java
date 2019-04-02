package irvine.oeis.a019;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019332 Lengths of quantum cellular automata that cycle through all possible values of the QCA vector.
 * @author Sean A. Irvine
 */
public class A019332 implements Sequence {

  private int mN = 0;

  private void step(final boolean[] a, final boolean[] b) {
    b[0] = a[1];
    b[a.length - 1] = a[a.length - 2];
    for (int k = 1; k < a.length - 1; ++k) {
      b[k] = a[k - 1] ^ a[k + 1];
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN > 126) {
        throw new UnsupportedOperationException();
      }
      // alternates between using a and b as the next generation
      boolean[] a = new boolean[mN];
      boolean[] b = new boolean[a.length];
      a[mN / 2] = true;
      final boolean[] e = Arrays.copyOf(a, a.length);
      final long target = ((1L << (mN / 2)) - 1) * 2;
      long steps = 0;
      while (steps < target) {
        step(a, b);
        ++steps;
        if (Arrays.equals(b, e)) {
          // cycle detected
          if (steps == target) {
            // every configuration occurred
            return Z.valueOf(mN);
          } else {
            break;
          }
        }
        final boolean[] t = a;
        a = b;
        b = t;
      }
    }
  }
}

