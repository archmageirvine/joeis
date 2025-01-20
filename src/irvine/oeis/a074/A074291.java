package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A074291 Positions in the Kolakoski sequence where A000002(n) is 1 if n is odd, or 2 if n is even.
 * @author Sean A. Irvine
 */
public class A074291 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074291() {
    super(1, 1, new A074290(), Z::isZero);
  }
}
