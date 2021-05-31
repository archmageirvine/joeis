package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a122.A122254;

/**
 * A048136 Tomahawk-nonconstructible n-gons.
 * @author Sean A. Irvine
 */
public class A048136 extends ComplementSequence {

  /** Construct the sequence. */
  public A048136() {
    super(new A122254(), Z.ONE);
  }
}
