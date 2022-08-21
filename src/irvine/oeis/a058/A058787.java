package irvine.oeis.a058;

import irvine.oeis.NonzeroSequence;
import irvine.oeis.a049.A049337;

/**
 * A058787 Triangle T(n,k) = number of polyhedra (triconnected planar graphs) with n faces and k vertices, where (n/2+2) &lt;= k &lt;= (2n+8).
 * @author Sean A. Irvine
 */
public class A058787 extends NonzeroSequence {

  /** Construct the sequence. */
  public A058787() {
    super(new A049337());
  }
}
