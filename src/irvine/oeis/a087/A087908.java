package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087908.
 * @author Sean A. Irvine
 */
public class A087908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087908() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 3, 17, 47});
  }
}
