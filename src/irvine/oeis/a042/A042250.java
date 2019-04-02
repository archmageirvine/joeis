package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042250 Numerators of continued fraction convergents to sqrt(651).
 * @author Sean A. Irvine
 */
public class A042250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042250() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3470, 0, 0, 0, 0, 0}, new long[] {25, 26, 51, 842, 893, 1735, 87643, 89378, 177021, 2921714, 3098735, 6020449});
  }
}
