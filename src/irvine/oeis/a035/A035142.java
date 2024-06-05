package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000009;

/**
 * A035142 Numbers n with property that number of partitions-into-distinct-parts of n is a perfect square.
 * @author Sean A. Irvine
 */
public class A035142 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A035142() {
    super(1, 0, new A000009(), Z::isSquare);
  }
}

