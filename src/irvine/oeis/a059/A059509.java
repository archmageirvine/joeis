package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059509 Main diagonal of the array <code>A059503</code>.
 * @author Sean A. Irvine
 */
public class A059509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059509() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 5, 19, 66});
  }
}
