package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003253.
 * @author Sean A. Irvine
 */
public class A003253 extends ComplementSequence {

  /** Construct the sequence. */
  public A003253() {
    super(new A003252(), Z.ONE);
  }
}
