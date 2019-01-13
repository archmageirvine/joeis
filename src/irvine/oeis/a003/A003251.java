package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003251.
 * @author Sean A. Irvine
 */
public class A003251 extends ComplementSequence {

  /** Construct the sequence. */
  public A003251() {
    super(new A003250(), Z.ONE);
  }
}
