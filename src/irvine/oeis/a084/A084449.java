package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A084449 Positions of sevens (ground states) in A084451.
 * @author Sean A. Irvine
 */
public class A084449 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084449() {
    super(0, 0, new A084451(), Z.SEVEN::equals);
  }
}
