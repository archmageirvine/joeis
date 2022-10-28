package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;

/**
 * A050813 Numbers n not palindromic in any base b, 2 &lt;= b &lt;= 10.
 * @author Sean A. Irvine
 */
public class A050813 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050813() {
    super(0, new A050812(), 0);
  }
}
