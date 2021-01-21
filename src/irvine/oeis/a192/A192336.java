package irvine.oeis.a192;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a028.A028237;

/**
 * A192336 Sums of two or more distinct squares.
 * @author Georg Fischer
 */
public class A192336 extends ComplementSequence {

  /** Construct the sequence. */
  public A192336() {
    super(new A028237(), Z.ONE);
  }
}
