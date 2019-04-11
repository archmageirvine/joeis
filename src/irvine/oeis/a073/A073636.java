package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073636 Period 3: repeat <code>[1, 8, 9] </code>; Digital root of A000578(n) <code>= n^3</code> for <code>n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A073636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073636() {
    super(new long[] {1, 0, 0}, new long[] {1, 8, 9});
  }
}
