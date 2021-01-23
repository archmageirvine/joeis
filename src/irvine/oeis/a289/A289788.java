package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289788 a(n) = (1/2)*A289787(n).
 * @author Sean A. Irvine
 */
public class A289788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289788() {
    super(new long[] {-1, 6, -6, 6}, new long[] {1, 6, 31, 156});
  }
}
