package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048691;

/**
 * A063774 Number of divisors of n^2 is a square.
 * @author Sean A. Irvine
 */
public class A063774 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A063774() {
    super(1, new A048691(), Z::isSquare);
  }
}
