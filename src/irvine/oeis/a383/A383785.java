package irvine.oeis.a383;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a022.A022544;
import irvine.oeis.a034.A034020;

/**
 * A383785 Numbers not occurring as norms of vectors in any regular planar lattice.
 * @author Sean A. Irvine
 */
public class A383785 extends IntersectionSequence {

  /** Construct the sequence. */
  public A383785() {
    super(1, new A022544(), new A034020());
  }
}
