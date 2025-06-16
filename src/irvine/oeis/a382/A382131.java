package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a381.A381767;

/**
 * A382131 Complement of A381767.
 * @author Sean A. Irvine
 */
public class A382131 extends ComplementSequence {

  /** Construct the sequence. */
  public A382131() {
    super(1, new A381767(), Z.ONE);
  }
}
