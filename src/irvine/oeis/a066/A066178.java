package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066178 Number of binary bit strings of length n with no block of 8 or more <code>0</code>'s. Nonzero heptanacci numbers, <code>A122189</code>.
 * @author Sean A. Irvine
 */
public class A066178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066178() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 16, 32});
  }
}
