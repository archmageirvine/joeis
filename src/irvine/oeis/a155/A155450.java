package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155450 Numbers equal to 5 or <code>18 mod 23</code>.
 * @author Sean A. Irvine
 */
public class A155450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155450() {
    super(new long[] {-1, 1, 1}, new long[] {5, 18, 28});
  }
}
