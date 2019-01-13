package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003247.
 * @author Sean A. Irvine
 */
public class A003247 extends ComplementSequence {

  /** Construct the sequence. */
  public A003247() {
    super(new A003248(), Z.ONE);
  }
}
