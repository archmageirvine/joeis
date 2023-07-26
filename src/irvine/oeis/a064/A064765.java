package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064765 a(n) is the smallest number such that for, all m&lt;n, both a(n)*a(m) and a(n)+a(m) are nonsquares.
 * @author Sean A. Irvine
 */
public class A064765 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean is(final long v) {
    for (final Z t : toList()) {
      if (t.add(v).isSquare() || t.multiply(v).isSquare()) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    long t = a(size() - 1).longValueExact();
    while (true) {
      if (is(++t)) {
        return Z.valueOf(t);
      }
    }
  }
}

