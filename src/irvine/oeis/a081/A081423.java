package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081423 Subdiagonal of array of n-gonal numbers <code>A081422</code>.
 * @author Sean A. Irvine
 */
public class A081423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081423() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 12, 34});
  }
}
