package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000408;

/**
 * A051952 Numbers that are not a sum of 3 positive squares nor are of the form 4^a*(8b+7) and which are not multiples of 4.
 * @author Sean A. Irvine
 */
public class A051952 extends ComplementSequence {

  /** Construct the sequence. */
  public A051952() {
    super(new A000408(), Z.ONE);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z u = t.makeOdd();
      if (t.auxiliary() <= 1) {
        final Z v = u.subtract(7);
        if (v.mod(8) != 0) {
          return t;
        }
      }
    }
  }
}
