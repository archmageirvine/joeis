package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159664 The general form of the recurrences are the a(j), b(j) and n(j) solutions of the 2 equations problem: 11*n(j)+1=a(j)*a(j) and 13*n(j)+1=b(j)*b(j); with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159664() {
    super(new long[] {-1, 24}, new long[] {1, 23});
  }
}
