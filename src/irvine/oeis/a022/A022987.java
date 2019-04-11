package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022987 <code>31-n</code>.
 * @author Sean A. Irvine
 */
public class A022987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022987() {
    super(new long[] {-1, 2}, new long[] {31, 30});
  }
}
