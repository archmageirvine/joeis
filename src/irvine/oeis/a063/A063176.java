package irvine.oeis.a063;

import irvine.oeis.IntersectionSequence;

/**
 * A063145.
 * @author Sean A. Irvine
 */
public class A063176 extends IntersectionSequence {

  /** Construct the sequence. */
  public A063176() {
    super(new A063175(), new A063174());
  }
}
