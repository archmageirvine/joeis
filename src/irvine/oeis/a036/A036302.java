package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a020.A020450;

/**
 * A036302 Composite numbers k such that the digits of the prime factors of k are either 1 or 2.
 * @author Sean A. Irvine
 */
public class A036302 extends Sequence1 {

  private final MemorySequence mP = MemorySequence.cachedSequence(sourcePrimes());
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(mP.a(0));
  }

  protected Sequence sourcePrimes() {
    return new A020450();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      int k = -1;
      while (true) {
        final Z p = mP.a(++k);
        if (p == null) {
          break;
        }
        if (p.compareTo(t) > 0) {
          mA.add(p);
          break;
        }
        mA.add(t.multiply(p));
      }
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}

