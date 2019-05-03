package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038721 <code>k=2</code> column of <code>A038719</code>.
 * @author Sean A. Irvine
 */
public class A038721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038721() {
    super(new long[] {24, -26, 9}, new long[] {2, 18, 110});
  }
}
