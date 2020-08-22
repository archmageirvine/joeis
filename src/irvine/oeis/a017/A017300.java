package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017300 a(n) = (10*n + 2)^8.
 * @author Sean A. Irvine
 */
public class A017300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017300() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 429981696, 54875873536L, 1099511627776L, 9682651996416L, 53459728531456L, 218340105584896L, 722204136308736L, 2044140858654976L});
  }
}
