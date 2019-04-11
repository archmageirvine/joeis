package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103772 Larger of two sides in <code>(a,a</code>,a-1)-integer triangle with integer area.
 * @author Sean A. Irvine
 */
public class A103772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103772() {
    super(new long[] {1, -15, 15}, new long[] {1, 17, 241});
  }
}
