package irvine.oeis.a390;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a386.A386762;
import irvine.oeis.a391.A391115;

/**
 * A390379 Powers k^m, 2 &lt;= m &lt;= 3, with k neither squarefree nor squareful.
 * @author Sean A. Irvine
 */
public class A390379 extends IntersectionSequence {

  /** Construct the sequence. */
  public A390379() {
    super(new A386762(), new A391115());
  }
}
