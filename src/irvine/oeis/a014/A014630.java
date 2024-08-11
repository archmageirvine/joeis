package irvine.oeis.a014;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a008.A008292;

/**
 * A014630 Distinct elements occurring in triangle of Eulerian numbers (unsorted).
 * @author Sean A. Irvine
 */
public class A014630 extends DistinctSequence {

  /** Construct the sequence. */
  public A014630() {
    super(0, new A008292());
  }
}
