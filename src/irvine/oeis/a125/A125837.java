package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125837 Numbers whose base 8 or octal representation is <code>6666666......6</code>.
 * @author Sean A. Irvine
 */
public class A125837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125837() {
    super(new long[] {-8, 9}, new long[] {0, 6});
  }
}
