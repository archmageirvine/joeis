package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016950 <code>a(n) = (6*n + 3)^6</code>.
 * @author Sean A. Irvine
 */
public class A016950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016950() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 531441, 11390625, 85766121, 387420489, 1291467969, 3518743761L});
  }
}
