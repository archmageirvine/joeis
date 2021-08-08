package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;

/**
 * A049989 a(n) is the number of arithmetic progressions of positive integers, nondecreasing with sum &lt;= n.
 * @author Sean A. Irvine
 */
public class A049989 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049989() {
    super(new SkipSequence(new A049988(), 1));
  }
}
