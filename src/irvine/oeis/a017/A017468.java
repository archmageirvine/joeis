package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017468 a(n) = (11*n + 6)^8.
 * @author Sean A. Irvine
 */
public class A017468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017468() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1679616, 6975757441L, 377801998336L, 5352009260481L, 39062500000000L, 191707312997281L, 722204136308736L, 2252292232139041L, 6095689385410816L});
  }
}
