package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008578;

/**
 * A075568 Rearrangement of noncomposite numbers such that every partial sum is composite.
 * @author Sean A. Irvine
 */
public class A075568 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Sequence nc = new A008578();
    while (true) {
      final Z m = nc.next();
      if (!mUsed.contains(m)) {
        final Z s = mSum.add(m);
        if (!s.isProbablePrime()) {
          mSum = s;
          mUsed.add(m);
          return m;
        }
      }
    }
  }
}

