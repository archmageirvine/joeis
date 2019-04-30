package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174685 Indices of Sophie Germain pentagonal numbers: indices i of pentagonal numbers <code>P(i) =</code> A000326(i) such that <code>2*P(i)+1</code> is also a pentagonal number.
 * @author Sean A. Irvine
 */
public class A174685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174685() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {0, 75, 244, 86359, 281384});
  }
}
