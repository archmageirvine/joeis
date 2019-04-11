package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125835 Numbers whose base 8 or octal representation is <code>22222222.......2</code>.
 * @author Sean A. Irvine
 */
public class A125835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125835() {
    super(new long[] {-8, 9}, new long[] {0, 2});
  }
}
