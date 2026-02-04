package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005382;

/**
 * A389838 allocated for Oliver Gramberg.
 * @author Sean A. Irvine
 */
public class A389838 extends ComplementSequence {

  /** Construct the sequence. */
  public A389838() {
    super(1, Z.TWO, new A005382());
  }
}
