package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125837 Numbers whose base 8 or octal representation is 6666666......6.
 * @author Sean A. Irvine
 */
public class A125837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125837() {
    super(new long[] {-8, 9}, new long[] {0, 6});
  }
}
