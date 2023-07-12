package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A006022 Sprague-Grundy (or Nim) values for the game of Maundy cake on an n X 1 sheet.
 * @author Sean A. Irvine
 */
public class A006022 extends MemoryFunction1Sequence<Z> {

  /** Construct the sequence. */
  public A006022() {
    super(1);
  }

  @Override
  public Z compute(final int n) {
    if (n <= 2) {
      return Z.valueOf(n - 1);
    }
    final Z[] p = Jaguar.factor(n).toZArray();
    final int np = n / p[0].intValue();
    return get(np).add(np);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN);
  }
}
