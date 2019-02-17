package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000404;

/**
 * A018825.
 * @author Sean A. Irvine
 */
public class A018825 extends ComplementSequence {

  /** Construct the sequence. */
  public A018825() {
    super(new A000404(), Z.ONE);
  }
}
