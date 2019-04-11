package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168661 <code>a(n) = n^7*(n^4 + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168661() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 1, 1088, 89667, 2105344, 24453125, 181538496, 989075143, 4296015872L, 15692921289L, 50005000000L, 142665578891L});
  }
}
