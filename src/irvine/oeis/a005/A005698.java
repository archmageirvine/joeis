package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005698.
 * @author Sean A. Irvine
 */
public class A005698 implements Sequence {

  private int mIndexA = 1;
  private int mIndexB = 1;

  private Z a(final int n) {
    return Z.ONE.shiftLeft(3 * n + 3).signedAdd((n & 1) == 0, Z.ONE).divide(9);
  }

  private Z b(final int n) {
    return Z.ONE.shiftLeft(3 * n + 5).signedAdd((n & 1) != 0, Z.FIVE).divide(9);
  }

  @Override
  public Z next() {
    final Z a = a(mIndexA);
    final Z b = b(mIndexB);
    if (a.compareTo(b) < 0) {
      ++mIndexA;
      return a;
    } else {
      ++mIndexB;
      return b;
    }
  }
}
