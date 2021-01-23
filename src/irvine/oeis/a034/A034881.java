package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034881 a(1) = 1; for n&gt;1, a(n) = smallest integer &gt; a(n-1) such that a(n)*a(i)+1 is prime for all 1 &lt;= i &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A034881 extends MemorySequence {

  private boolean is(final Z a) {
    for (final Z t : this) {
      if (!a.multiply(t).add(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z m = get(size() - 1);
    while (true) {
      m = m.add(1);
      if (is(m)) {
        return m;
      }
    }
  }
}
