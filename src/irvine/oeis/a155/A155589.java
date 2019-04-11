package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155589 <code>6^n+2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155589() {
    super(new long[] {12, -20, 9}, new long[] {1, 7, 39});
  }
}
