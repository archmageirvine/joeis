package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016988 <code>a(n) = (7*n)^8</code>.
 * @author Sean A. Irvine
 */
public class A016988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016988() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 5764801, 1475789056, 37822859361L, 377801998336L, 2251875390625L, 9682651996416L, 33232930569601L, 96717311574016L});
  }
}
