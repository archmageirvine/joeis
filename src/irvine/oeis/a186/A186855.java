package irvine.oeis.a186;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186855 Number of 6-step knight&apos;s tours on an (n+2) X (n+2) board summed over all starting positions.
 * @author Georg Fischer
 */
public class A186855 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186855() {
    super(1, "[[126288,-102168,18584],[-1]]", "16,800,8352,34448,91328,186544,322528", 0);
  }
}
