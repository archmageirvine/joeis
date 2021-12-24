package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026567 a(n) = Sum_{i=0..2*n} Sum_{j=0..i} T(i, j), where T is given by A026552.
 * @author Sean A. Irvine
 */
public class A026567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026567() {
    super(new long[] {-6, 6, 1}, new long[] {1, 4, 13});
  }
}
