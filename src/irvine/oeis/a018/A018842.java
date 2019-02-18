package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;
import irvine.oeis.PrependSequence;

/**
 * A018842.
 * @author Sean A. Irvine
 */
public class A018842 extends PrependSequence {

  /** Construct the sequence. */
  public A018842() {
    super(new LinearRecurrence(new long[] {-1, 2}, new long[] {120, 148}), 1, 8, 32, 68, 96);
  }
}
