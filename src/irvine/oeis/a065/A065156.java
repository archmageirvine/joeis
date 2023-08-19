package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a064.A064362;

/**
 * A065156 Numbers n such that some Lucas number (A000204) is divisible by n.
 * @author Sean A. Irvine
 */
public class A065156 extends ComplementSequence {

  /** Construct the sequence. */
  public A065156() {
    super(1, new A064362(), Z.ONE);
  }
}

