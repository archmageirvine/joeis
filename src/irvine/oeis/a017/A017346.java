package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017346 <code>a(n) = (10*n + 6)^6</code>.
 * @author Sean A. Irvine
 */
public class A017346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017346() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {46656, 16777216, 308915776, 2176782336L, 9474296896L, 30840979456L, 82653950016L});
  }
}
