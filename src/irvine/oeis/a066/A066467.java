package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A066467 Numbers having just two anti-divisors.
 * @author Sean A. Irvine
 */
public class A066467 extends Sequence1 {

  private final DirectSequence mA = new A066272();
  private final TreeSet<Z> mQ = new TreeSet<>();

  @Override
  public Z next() {
    if (mQ.isEmpty()) {
      mQ.add(Z.ONE);
      return Z.FIVE;
    }
    while (true) {
      final Z t = mQ.pollFirst();
      mQ.add(t.multiply2());
      mQ.add(t.multiply(3));
      if (mA.a(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}

