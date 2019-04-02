package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003259 Complement of A003258.
 * @author Sean A. Irvine
 */
public class A003259 extends ComplementSequence {

  /** Construct the sequence. */
  public A003259() {
    super(new A003258(), Z.ONE);
  }
}
