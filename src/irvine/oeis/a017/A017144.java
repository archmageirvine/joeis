package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017144 a(n) = (8*n + 6)^8.
 * @author Sean A. Irvine
 */
public class A017144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017144() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1679616, 1475789056, 54875873536L, 656100000000L, 4347792138496L, 20047612231936L, 72301961339136L, 218340105584896L, 576480100000000L});
  }
}
