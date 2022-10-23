package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a020.A020652;
import irvine.oeis.a020.A020653;

/**
 * A048705 The rule numbers for 1-D CA composed of Rules "90" and "150" so that each direction occurs only once.
 * @author Sean A. Irvine
 */
public class A048705 extends Sequence1 {

  // After Antti Karttunen

  protected final Sequence mExtendedA020652 = new PrependSequence(new A020652(), 0, 1);
  protected final Sequence mExtendedA020653 = new PrependSequence(new A020653(), 1, 0);

  protected int bitI(final Z x, final int i) {
    return i < 0 ? 0 : x.testBit(i) ? 1 : 0;
  }

  protected Z rule90(final Z seed, final int n) {
    if (n == 0) {
      return seed;
    }
    final int sl = seed.add(1).bitLength() - 1;
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * n + sl; ++k) {
      sum = sum.add(Z.valueOf((bitI(rule90(seed, n - 1), k) + bitI(rule90(seed, n - 1), k - 2)) & 1).shiftLeft(k));
    }
    return sum;
  }

  protected Z rule150(final Z seed, final int n) {
    if (n == 0) {
      return seed;
    }
    final int sl = seed.add(1).bitLength() - 1;
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * n + sl; ++k) {
      sum = sum.add(Z.valueOf((bitI(rule150(seed, n - 1), k) + bitI(rule150(seed, n - 1), k - 1) + bitI(rule150(seed, n - 1), k - 2)) & 1).shiftLeft(k));
    }
    return sum;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final int p = mExtendedA020652.next().intValueExact();
    final int q = mExtendedA020653.next().intValueExact();
    final int r = p + q;
    for (int k = 0; k < 1 << (2 * r + 1); ++k) {
      final int v = bitI(rule150(rule90(Z.valueOf(k), q), p), 2 * r);
      sum = sum.add(Z.valueOf(v).shiftLeft(k));
    }
    return sum;
  }
}
