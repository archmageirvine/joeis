package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.FilterPositionSequence;

/**
 * A076660 Numbers m such that A076644(m) = floor((2/3)*m*(sqrt(m)+1)).
 * @author Sean A. Irvine
 */
public class A076660 extends FilterPositionSequence {

  private static final CR C = CR.valueOf(new Q(2, 3));

  /** Construct the sequence. */
  public A076660() {
    super(1, 1, new A076644(), (n, k) -> k.equals(CR.valueOf(n).sqrt().add(1).multiply(n).multiply(C).floor()));
  }
}
