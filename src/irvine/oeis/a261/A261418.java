package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261418 The UUDDUUD sequence, or the <code>3/7</code> sequence: start with 4, then successively add or subtract the integers <code>1,2,3,...,</code> using the repeating sign pattern <code> + + - - + + -</code>.
 * @author Sean A. Irvine
 */
public class A261418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261418() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1}, new long[] {4, 5, 7, 4, 0, 5, 11, 4, 12, 21, 11, 0, 12, 25, 11});
  }
}
