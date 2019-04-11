package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017646 <code>(12n+10)^6</code>.
 * @author Sean A. Irvine
 */
public class A017646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017646() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1000000, 113379904, 1544804416, 9474296896L, 38068692544L, 117649000000L, 304006671424L});
  }
}
