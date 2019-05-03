package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003742 Number of 2-factors in <code>O_5 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003742() {
    super(new long[]{-405, 7239, -6539, -707, 396, 26},
      new long[]{6, 327, 11040, 406731, 14683587, 532938234}
    );
  }
}
