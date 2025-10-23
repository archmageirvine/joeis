package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A081313 Numbers having more than one representation as sum of a prime and a 3-smooth number.
 * @author Sean A. Irvine
 */
public class A081313 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081313() {
    super(1, new A081308(), k -> k.compareTo(Z.ONE) > 0);
  }
}

