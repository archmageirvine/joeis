package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103165.
 * @author Sean A. Irvine
 */
public class A103165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103165() {
    super(new long[] {1, 0, -4468995, 0, 4468995, 0}, new long[] {1, 70, 6469855, 314976376, 28913745325725L, 1407627555984530L});
  }
}
