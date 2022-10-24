package irvine.oeis.a031;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A031980 a(n) is the smallest number &gt;= 1 not occurring earlier and not the sum of cubes of two distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A031980 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z t = get(size() - 1);
    while (true) {
      t = t.add(1);
      if (!mForbidden.remove(t)) {
        final Z t3 = t.pow(3);
        for (final Z u : this) {
          mForbidden.add(t3.add(u.pow(3)));
        }
        return t;
      }
    }
  }
}
