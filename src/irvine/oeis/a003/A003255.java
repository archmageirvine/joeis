package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003255 Complement of A003254.
 * @author Sean A. Irvine
 */
public class A003255 extends ComplementSequence {

  /** Construct the sequence. */
  public A003255() {
    super(new A003254(), Z.ONE);
  }
}
