package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017405 <code>(11n+1)^5</code>.
 * @author Sean A. Irvine
 */
public class A017405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017405() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 248832, 6436343, 45435424, 184528125, 550731776});
  }
}
