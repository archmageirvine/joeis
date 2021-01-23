package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeClosureSequence;
import irvine.oeis.a020.A020449;

/**
 * A036928 Composite numbers n such that digits of prime factors of n are either 0 or 1.
 * @author Sean A. Irvine
 */
public class A036928 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A036928() {
    super(new A020449());
    next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}
