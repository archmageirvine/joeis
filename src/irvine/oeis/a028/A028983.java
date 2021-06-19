package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A028983 Numbers whose sum of divisors is even.
 * @author Sean A. Irvine
 */
public class A028983 extends ComplementSequence {

  /** Construct the sequence. */
  public A028983() {
    super(new A028982(), Z.THREE);
  }
}
