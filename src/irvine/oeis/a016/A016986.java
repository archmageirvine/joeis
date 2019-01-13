package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016986.
 * @author Sean A. Irvine
 */
public class A016986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016986() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 117649, 7529536, 85766121, 481890304, 1838265625, 5489031744L});
  }
}
