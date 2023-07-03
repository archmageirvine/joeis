package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Z;

/**
 * A006022 Sprague-Grundy (or Nim) values for the game of Maundy cake on an n X 1 sheet.
 * @author Sean A. Irvine
 */
public class A006022 extends MemoryFunction1Sequence<Z> {

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
