package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003773.
 * @author Sean A. Irvine
 */
public class A003773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003773() {
    super(new long[]{1, -205, 1394, -1394, 205},
      new long[]{16, 3456, 686000, 135834624, 26894628304L}
    );
  }
}
