package irvine.oeis.a057;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004020;

/**
 * A057656 Number of points (x,y) in square lattice with (x-1/2)^2+y^2 &lt;= n.
 * @author Sean A. Irvine
 */
public class A057656 extends PartialSumSequence {

  /** Construct the sequence. */
  public A057656() {
    super(new A004020());
  }
}
