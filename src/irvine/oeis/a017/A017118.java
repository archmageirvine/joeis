package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017118 <code>a(n) = (8*n + 4)^6</code>.
 * @author Sean A. Irvine
 */
public class A017118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017118() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 2985984, 64000000, 481890304, 2176782336L, 7256313856L, 19770609664L});
  }
}
