package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A064695 Complement of A064683.
 * @author Sean A. Irvine
 */
public class A064695 extends ComplementSequence {

  /** Construct the sequence. */
  public A064695() {
    super(1, new A064683(), Z.ONE);
  }
}
