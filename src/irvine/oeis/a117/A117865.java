package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117865 Number of palindromes (in base <code>6)</code> below <code>6^n</code>.
 * @author Sean A. Irvine
 */
public class A117865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117865() {
    super(new long[] {-6, 6, 1}, new long[] {5, 10, 40});
  }
}
