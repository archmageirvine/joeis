package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156636 <code>4394n + 1820</code>.
 * @author Sean A. Irvine
 */
public class A156636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156636() {
    super(new long[] {-1, 2}, new long[] {1820, 6214});
  }
}
