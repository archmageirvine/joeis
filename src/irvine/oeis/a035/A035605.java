package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035605.
 * @author Sean A. Irvine
 */
public class A035605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035605() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 2, 44, 486, 3608, 20330, 93060, 361550, 1229360, 3742290, 10377180, 26572086});
  }
}
