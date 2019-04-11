package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017565 <code>(12n+3)^9</code>.
 * @author Sean A. Irvine
 */
public class A017565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017565() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 38443359375L, 7625597484987L, 208728361158759L, 2334165173090451L, 15633814156853823L, 75084686279296875L, 285544154243029527L, 913517247483640899L, 2558036924386500591L});
  }
}
