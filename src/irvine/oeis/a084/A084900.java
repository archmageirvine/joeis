package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084900 <code>3^(n-2)n(5n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A084900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084900() {
    super(new long[] {27, -27, 9}, new long[] {0, 1, 11});
  }
}
