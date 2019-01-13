package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016320.
 * @author Sean A. Irvine
 */
public class A016320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016320() {
    super(new long[] {192, -136, 22}, new long[] {1, 22, 348});
  }
}
