package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022979 <code>23-n</code>.
 * @author Sean A. Irvine
 */
public class A022979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022979() {
    super(new long[] {-1, 2}, new long[] {23, 22});
  }
}
