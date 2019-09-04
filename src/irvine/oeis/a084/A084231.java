package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084231 Numbers k such that the <code>root-mean-square</code> value of <code>1, 2</code>, ..., k, i.e., <code>sqrt((1/k)*Sum_{j=1..k} j^2)</code>, is an integer.
 * @author Sean A. Irvine
 */
public class A084231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084231() {
    super(new long[] {1, -195, 195}, new long[] {1, 337, 65521});
  }
}
