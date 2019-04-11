package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033275 Number of diagonal dissections of <code>an</code> n-gon into 3 regions.
 * @author Sean A. Irvine
 */
public class A033275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033275() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 21, 56, 120});
  }
}
