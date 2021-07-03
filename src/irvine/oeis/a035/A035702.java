package irvine.oeis.a035;

import irvine.oeis.IntersectionSequence;

/**
 * A035702 Numbers k such that the numbers of partitions and partitions-into-distinct-parts of k are both multiples of 12.
 * @author Sean A. Irvine
 */
public class A035702 extends IntersectionSequence {

  /** Construct the sequence. */
  public A035702() {
    super(new A035700(), new A035701());
  }
}

