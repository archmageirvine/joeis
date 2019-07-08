package irvine.oeis.a020;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a080.A080039;

/**
 * A020962 <code>a(n) = Sum_{k &gt;= 1} floor((1+sqrt(2))^(n-k))</code>.
 * @author Sean A. Irvine
 */
public class A020962 extends PartialSumSequence {

  /** Construct the sequence. */
  public A020962() {
    super(new A080039());
  }
}
