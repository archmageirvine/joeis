package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065063 Numbers k such that A065608(k) is a square.
 * @author Sean A. Irvine
 */
public class A065063 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065063() {
    super(1, new A065608(), Z::isSquare);
  }
}

