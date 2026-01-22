package irvine.oeis.a392;

import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392093 a(n) is the terminal value obtained by repeatedly replacing the sorted set of positive divisors of n with the sorted set of consecutive differences, continuing until only one number remains.
 * @author Sean A. Irvine
 */
public class A392093 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    TreeSet<Z> t = new TreeSet<>();
    Collections.addAll(t, Jaguar.factor(++mN).divisors());
    while (t.size() > 1) {
      final TreeSet<Z> next = new TreeSet<>();
      Z prev = null;
      for (final Z v : t) {
        if (prev != null) {
          next.add(v.subtract(prev));
        }
        prev = v;
      }
      t = next;
    }
    return t.first();
  }
}
