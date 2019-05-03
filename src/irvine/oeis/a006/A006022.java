package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006022 <code>Sprague-Grundy</code> (or Nim) values for the game of Maundy cake on an <code>n X 1</code> sheet.
 * @author Sean A. Irvine
 */
public class A006022 extends MemoryFunction1<Z> implements Sequence {

  @Override
  public Z compute(final int n) {
    if (n <= 2) {
      return Z.valueOf(n - 1);
    }
    final Z[] p = Cheetah.factor(n).toZArray();
    final int np = n / p[0].intValue();
    return get(np).add(np);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN);
  }
}
