package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080386 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080386() {
    super(1, 0, new A080383(), Z.EIGHT::equals);
  }
}
