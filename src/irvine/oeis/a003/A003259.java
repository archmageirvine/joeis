package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003259 Complement of <code>A003258</code>.
 * @author Sean A. Irvine
 */
public class A003259 extends ComplementSequence {

  /** Construct the sequence. */
  public A003259() {
    super(new A003258(), Z.ONE);
  }
}
