package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017648 (12n+10)^8.
 * @author Sean A. Irvine
 */
public class A017648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017648() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {100000000, 54875873536L, 1785793904896L, 20047612231936L, 128063081718016L, 576480100000000L, 2044140858654976L, 6095689385410816L, 15938480745308416L});
  }
}
