package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017574 <code>(12n+4)^6</code>.
 * @author Sean A. Irvine
 */
public class A017574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017574() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 16777216, 481890304, 4096000000L, 19770609664L, 68719476736L, 192699928576L});
  }
}
