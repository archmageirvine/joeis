package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059505 Transform of A059502 applied to sequence <code>2,3,4,..</code>.
 * @author Sean A. Irvine
 */
public class A059505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059505() {
    super(new long[] {-1, 6, -11, 6}, new long[] {2, 5, 14, 40});
  }
}
