package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089979 Expansion of <code>1/(1-4x-4x^3)</code>.
 * @author Sean A. Irvine
 */
public class A089979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089979() {
    super(new long[] {4, 0, 4}, new long[] {1, 4, 16});
  }
}
