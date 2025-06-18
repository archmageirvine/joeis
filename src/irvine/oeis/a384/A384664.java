package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A384664 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384664 extends ComplementSequence {

  /** Construct the sequence. */
  public A384664() {
    super(1, new A384663(), Z.ONE);
  }
}

