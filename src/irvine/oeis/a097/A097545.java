package irvine.oeis.a097;

import java.util.LinkedList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A097545 Numerators of "Farey fraction" approximations to Pi.
 * @author Sean A. Irvine
 */
public class A097545 extends Sequence0 {

  private Z mP0 = null;
  private Z mQ0 = Z.ZERO;
  private Z mP1 = null;
  private Z mQ1 = Z.ONE;
  private CR mX = CR.PI;

  private final LinkedList<Pair<Z, Z>> mA = new LinkedList<>();

  protected Z select(final Z p, final Z q) {
    return p;
  }

  @Override
  public Z next() {
    if (mP1 == null) {
      if (mP0 == null) {
        mP0 = Z.ONE;
        return select(mP0, mQ0);
      } else {
        mP1 = Z.ZERO;
        return select(mP1, mQ1);
      }
    }
    while (mA.isEmpty()) {
      final long b = mX.floor().longValueExact();
      for (long k = 0; k < b; ++k) {
        mP1 = mP1.add(mP0);
        mQ1 = mQ1.add(mQ0);
        mA.add(new Pair<>(mP1, mQ1));
      }
      final Z prevP = mP0;
      final Z prevQ = mQ0;
      mP0 = mP1;
      mQ0 = mQ1;
      mP1 = prevP;
      mQ1 = prevQ;
      mX = mX.subtract(b).inverse();
    }
    final Pair<Z, Z> e = mA.pollFirst();
    return select(e.left(), e.right());
  }
}
