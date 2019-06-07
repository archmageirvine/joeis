package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129722 Number of <code>0</code>'s in even position in all Fibonacci binary words of length <code>n</code>. A Fibonacci binary word is a binary word having no 00 subword.
 * @author Sean A. Irvine
 */
public class A129722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129722() {
    super(new long[] {1, 1, -4, -3, 4, 1}, new long[] {0, 0, 1, 1, 5, 6});
  }
}
