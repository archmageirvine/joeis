package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025982.
 * @author Sean A. Irvine
 */
public class A025982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025982() {
    super(new long[] {-864, 816, -242, 27}, new long[] {1, 27, 487, 7431});
  }
}
