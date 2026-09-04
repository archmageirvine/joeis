package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a257.A257297;
import irvine.oeis.a257.A257850;

/**
 * A394429 allocated for Nicolas B\u011blohoubek.
 * @author Sean A. Irvine
 */
public class A394429 extends Sequence1 {

  private final DirectSequence mA = new A257297();
  private final DirectSequence mB = new A257850();
  private long mN = -1;

  private boolean is(final Z t) {
    final HashSet<Z> seen = new HashSet<>();
    Z x = t;
    do {
      x = mA.a(x).add(mB.a(x));
      if (x.compareTo(t) < 0) {
        return false;
      }
    } while (seen.add(x));
    return seen.contains(t);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN);
      if (is(t)) {
        return t;
      }
    }
  }
}

