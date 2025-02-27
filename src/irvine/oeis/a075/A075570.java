package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A075570 Lexicographically earliest sequence of distinct composite numbers such that a(k) + a(k+1) is prime for all k.
 * @author Sean A. Irvine
 */
public class A075570 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    final Sequence c = new A002808();
    while (true) {
      final Z m = c.next();
      if (!mUsed.contains(m)) {
        if (mUsed.isEmpty() || mA.add(m).isProbablePrime()) {
          mA = m;
          mUsed.add(m);
          return m;
        }
      }
    }
  }
}

