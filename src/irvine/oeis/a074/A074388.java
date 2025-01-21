package irvine.oeis.a074;

import irvine.oeis.a097.A097023;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074388 Numbers of the form 2*k^2 such that sigma(2*k^2) is an odd square.
 * @author Sean A. Irvine
 */
public class A074388 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074388() {
    super(1, new A097023(), k -> k.square().multiply2());
  }
}
