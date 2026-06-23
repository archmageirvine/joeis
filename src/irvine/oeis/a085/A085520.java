package irvine.oeis.a085;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085520 Numbers whose digits alternate between prime and nonprime.
 * @author Sean A. Irvine
 */
public class A085520 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 1; k < 10; ++k) {
        mA.add(Z.valueOf(k));
      }
    }
    while (true) {
      final Z t = mA.pollFirst();
      final Z u = t.multiply(10);
      if (Predicates.PRIME.is(t.mod(10))) {
        mA.add(u);
        mA.add(u.add(1));
        mA.add(u.add(4));
        mA.add(u.add(6));
        mA.add(u.add(8));
        mA.add(u.add(9));
      } else {
        mA.add(u.add(2));
        mA.add(u.add(3));
        mA.add(u.add(5));
        mA.add(u.add(7));
      }
      if (t.compareTo(Z.TEN) >= 0) {
        return t;
      }
    }
  }
}
