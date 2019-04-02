package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051049 Number of moves needed to solve an (n+1)-ring baguenaudier if two simultaneous moves of the two end rings are counted as one.
 * @author Sean A. Irvine
 */
public class A051049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051049() {
    super(new long[] {-2, 1, 2}, new long[] {1, 1, 4});
  }
}
