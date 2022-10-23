package irvine.oeis.a058;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058812 Irregular triangle of rows of numbers in increasing order. Row 1 = {1}. Row m + 1 contains all numbers k such that phi(k) is in row m.
 * @author Sean A. Irvine
 */
public class A058812 extends Sequence0 {

  private Set<Z> mA = null;
  private TreeSet<Z> mB = new TreeSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Collections.singleton(Z.ONE);
      mB.add(Z.ONE);
    } else if (mB.isEmpty()) {
      final Set<Z> t = new HashSet<>();
      for (final Z u : mA) {
        t.addAll(Euler.inversePhi(u));
      }
      t.remove(Z.ONE);
      mA = t;
      mB = new TreeSet<>(mA);
    }
    return mB.pollFirst();
  }
}
