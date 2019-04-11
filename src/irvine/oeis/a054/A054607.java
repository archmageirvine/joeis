package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054607 <code>a(n) =</code> Sum_{d|8} phi(d)*n^(8/d).
 * @author Sean A. Irvine
 */
public class A054607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054607() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 8, 288, 6672, 65840, 391320, 1681008, 5767328, 16781472});
  }
}
