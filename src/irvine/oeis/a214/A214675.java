package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214675.
 * @author Sean A. Irvine
 */
public class A214675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214675() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 47});
  }
}
