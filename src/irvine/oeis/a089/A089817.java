package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089817.
 * @author Sean A. Irvine
 */
public class A089817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089817() {
    super(new long[] {1, -6, 6}, new long[] {1, 6, 30});
  }
}
