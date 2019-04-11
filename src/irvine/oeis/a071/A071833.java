package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071833 Frequency ratios for notes of C-major scale starting at c <code>= 24</code>.
 * @author Sean A. Irvine
 */
public class A071833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071833() {
    super(new long[] {2, 0, 0, 0, 0, 0, 0}, new long[] {24, 27, 30, 32, 36, 40, 45});
  }
}
