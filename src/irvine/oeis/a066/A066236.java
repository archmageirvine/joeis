package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066236 Numbers k such that the sum of digits of k^k is a square.
 * @author Sean A. Irvine
 */
public class A066236 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066236() {
    super(1, 0, new A066588(), Z::isSquare);
  }
}
