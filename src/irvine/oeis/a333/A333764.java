package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333764 Numbers k such that the k-th composition in standard order is a co-necklace.
 * @author Gregory Morse
 */
public class A333764 extends Sequence1 {
  private Z mN = Z.ZERO;

  protected static int[] composition(final Z n) {
    final int[] parts = new int[n.bitCount()];
    int part = -1;
    for (int k = n.bitLength() - 1; k >= 0; --k) {
      if (n.testBit(k)) {
        ++part;
      }
      ++parts[part];
    }
    return parts;
  }

  protected boolean accept(final int[] parts) {
    for (int shift = 1; shift < parts.length; ++shift) {
      for (int k = 0; k < parts.length; ++k) {
        final int c = Integer.compare(parts[k], parts[(k + shift) % parts.length]);
        if (c < 0) {
          return false;
        }
        if (c > 0) {
          break;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!accept(composition(mN)));
    return mN;
  }
}
