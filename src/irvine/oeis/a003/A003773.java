package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003773 Number of spanning trees in K_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003773() {
    super(1, new long[]{1, -205, 1394, -1394, 205},
      new long[]{16, 3456, 686000, 135834624, 26894628304L}
    );
  }
}
