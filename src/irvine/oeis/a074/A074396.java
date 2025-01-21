package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a071.A071695;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074396 a(n) = 10 - (p mod 10), where p is the n-th prime congruent to 1 (mod 4) for which p+2 is also prime.
 * @author Sean A. Irvine
 */
public class A074396 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074396() {
    super(1, new A071695(), p -> Z.TEN.subtract(p.mod(10)));
  }
}
