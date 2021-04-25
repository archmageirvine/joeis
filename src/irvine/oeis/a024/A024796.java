package irvine.oeis.a024;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A024796 Numbers expressible in more than one way as i^2 + j^2 + k^2, where 1 &lt;= i &lt;= j &lt;= k.
 * @author Sean A. Irvine
 */
public class A024796 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A024796() {
    super(2, 3, 2);
  }
}
