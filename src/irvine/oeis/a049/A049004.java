package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049004 First letter of English names for months of year, mapping A <code>-&gt; 1</code>, B <code>-&gt; 2</code> etc.
 * @author Sean A. Irvine
 */
public class A049004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049004() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 6, 13, 1, 13, 10, 10, 1, 19, 15, 14, 4});
  }
}
