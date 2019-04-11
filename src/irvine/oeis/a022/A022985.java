package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022985 <code>29-n</code>.
 * @author Sean A. Irvine
 */
public class A022985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022985() {
    super(new long[] {-1, 2}, new long[] {29, 28});
  }
}
