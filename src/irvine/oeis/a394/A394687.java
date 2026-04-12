package irvine.oeis.a394;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a100.A100073;

/**
 * A394687 Number of ordered pairs of positive integers (a,b) with a &lt; b such that b^2 - a^2 &lt;= n.
 * @author Sean A. Irvine
 */
public class A394687 extends PartialSumSequence {

  /** Construct the sequence. */
  public A394687() {
    super(1, new A100073());
  }
}
