package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145321.
 * @author Sean A. Irvine
 */
public class A145321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145321() {
    super(new long[] {1, -24303, 24303}, new long[] {682, 16951327, 411951524722L});
  }
}
