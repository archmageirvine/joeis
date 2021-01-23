package irvine.oeis.a015;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000741;

/**
 * A015616 Number of triples (i,j,k) with 1 &lt;= i &lt; j &lt; k &lt;= n and gcd(i,j,k) = 1.
 * @author Sean A. Irvine
 */
public class A015616 extends PartialSumSequence {

  /** Construct the sequence. */
  public A015616() {
    super(new A000741());
  }
}
