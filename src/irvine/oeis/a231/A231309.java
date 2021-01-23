package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231309 Recurrence a(n) = a(n-2) + n^M for M=10, starting with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A231309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231309() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 1, 1024, 59050, 1049600, 9824675, 61515776, 292299924, 1135257600, 3779084325L, 11135257600L, 29716508926L});
  }
}
