package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011943 Numbers n such that any group of n consecutive integers has integral standard deviation <code>{viz. A011944(n)}</code>.
 * @author Sean A. Irvine
 */
public class A011943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011943() {
    super(new long[] {-1, 14}, new long[] {1, 7});
  }
}
