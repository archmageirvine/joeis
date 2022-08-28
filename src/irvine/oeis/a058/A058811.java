package irvine.oeis.a058;

import java.util.HashSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058793.
 * @author Sean A. Irvine
 */
public class A058811 implements Sequence {

  private HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
    } else {
      final HashSet<Z> t = new HashSet<>();
      for (final Z u : mA) {
        t.addAll(Euler.inversePhi(u));
      }
      t.remove(Z.ONE);
      mA = t;
    }
    return Z.valueOf(mA.size());
  }
}
