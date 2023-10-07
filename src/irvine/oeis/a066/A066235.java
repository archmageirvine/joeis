package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a004.A004152;

/**
 * A066235 Numbers k such that the sum of digits of k! is a square.
 * @author Sean A. Irvine
 */
public class A066235 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066235() {
    super(1, 0, new A004152(), Z::isSquare);
  }
}
