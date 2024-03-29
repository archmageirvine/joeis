package irvine.oeis.a057;

import irvine.oeis.FilterSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005883;

/**
 * A057962 Number of points (x,y) in square lattice with (x-1/2)^2+(y-1/2)^2 &lt;= n.
 * @author Sean A. Irvine
 */
public class A057962 extends PartialSumSequence {

  /** Construct the sequence. */
  public A057962() {
    super(1, new FilterSequence(new A005883(), FilterSequence.NONZERO));
  }
}
