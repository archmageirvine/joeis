package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041874 Numerators of continued fraction convergents to <code>sqrt(459)</code>.
 * @author Sean A. Irvine
 */
public class A041874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041874() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 999700, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {21, 43, 107, 150, 707, 14997, 60695, 75692, 212079, 499850, 21205779, 42911408, 107028595, 149940003, 706788607, 14992500750L, 60676791607L, 75669292357L, 212015376321L, 499700044999L});
  }
}
