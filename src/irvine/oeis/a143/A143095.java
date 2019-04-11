package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143095 <code>(1, 2, 4, 8,...)</code> interleaved with <code>(4, 8, 16, 32,...)</code>.
 * @author Sean A. Irvine
 */
public class A143095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143095() {
    super(new long[] {2, 0}, new long[] {1, 4});
  }
}
