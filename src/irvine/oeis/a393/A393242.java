package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393242 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393242 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;
  private final HashMap<Z, Integer> mT = new HashMap<>();

  private Z w(final int f, final List<Integer> g) {
    if (f == 1) {
      return Z.ONE;
    }
    if (g.isEmpty()) {
      return Z.ZERO;
    }
    Z c = Z.ZERO;
    final int m = g.get(0);
    final List<Integer> r = g.subList(1, g.size());
    for (int e = 0; e <= m; ++e) {
      if (f % (e + 1) == 0) {
        c = c.add(w(f / (e + 1), r));
      }
    }
    return c;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z i : fs.toZArray()) {
      mT.merge(i, fs.getExponent(i), Integer::sum);
    }
    return w(mN, new ArrayList<>(mT.values()));
  }
}
