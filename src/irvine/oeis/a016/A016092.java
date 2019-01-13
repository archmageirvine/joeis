package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016092.
 * @author Sean A. Irvine
 */
public class A016092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016092() {
    super(new long[] {-9504, 3900, -595, 40}, new long[] {1, 40, 1005, 20300});
  }
}
