package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a058.A058654;

/**
 * A064233 Numbers that are not the sum of a prime number and a nonzero square.
 * @author Sean A. Irvine
 */
public class A064233 extends ComplementSequence {

  /** Construct the sequence. */
  public A064233() {
    super(1, new A058654(), Z.ONE);
  }
}
