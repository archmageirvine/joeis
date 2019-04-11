package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017571 <code>(12n+4)^3</code>.
 * @author Sean A. Irvine
 */
public class A017571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017571() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 4096, 21952, 64000});
  }
}
