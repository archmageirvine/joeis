package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083683 <code>a(n) = 11*2^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A083683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083683() {
    super(new long[] {-2, 3}, new long[] {12, 23});
  }
}
