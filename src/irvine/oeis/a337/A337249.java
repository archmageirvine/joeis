package irvine.oeis.a337;

import java.util.LinkedList;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a097.A097545;

/**
 * A337249 Numbers k for which csc(k) &gt; k.
 * @author Sean A. Irvine
 */
public class A337249 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private final Sequence mS = new A097545() {
    @Override
    protected Z select(final Z p, final Z q) {
      if (p.isOne()) {
        return null;
      }
      if (p.isZero()) {
        mA.add(Z.ONE);
        return null;
      }
      final CR err = CR.PI.multiply(q).subtract(p).abs();
      final Z tMax = err.multiply(p).sqrt().inverse().floor().add(2);
      final Z lim = tMax.multiply(p);
      for (Z k = p; k.compareTo(lim) < 0; k = k.add(p)) {
        final CR n = CR.valueOf(k);
        if (ComputableReals.SINGLETON.csc(n).compareTo(n) > 0) {
          mA.add(k);
        }
      }
      return null;
    }
  };

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mS.next();
    }
    return mA.pollFirst();
  }
}
