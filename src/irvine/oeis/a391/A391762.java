package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A391762 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A391762 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391762() {
    super(1, k -> {
      final Z z = Z.valueOf(k);
      final Z k2 = z.multiply2();
      if (k2.add(1).isProbablePrime()) {
        return false;
      }
      if (z.square().multiply(4).add(1).isProbablePrime()) {
        return false;
      }
      k2.isPower();
      if (k2.auxiliary() >= 3 && (k2.auxiliary() & 1) == 1) {
        return true;
      }
      final Z t = k2.makeOdd();
      if (t.isOne() && t.auxiliary() > 2 && !Predicates.POWER_OF_TWO.is(t.auxiliary())) {
        return true;
      }
      return false;
    });
  }
}
