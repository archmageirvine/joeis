package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A064295 Numbers k such that every (prime) factor of k!+1 is one more than a multiple of k.
 * @author Sean A. Irvine
 */
public class A064295 extends ComplementSequence {

  /** Construct the sequence. */
  public A064295() {
    super(new A064164(), Z.ONE);
  }
}
