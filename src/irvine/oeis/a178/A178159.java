package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178159 Modified variant of A006645, the self-convolution of the Pell series.
 * @author Sean A. Irvine
 */
public class A178159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178159() {
    super(new long[] {1, 4, 4, 4, 4, -12, 0, 4}, new long[] {1, 2, 8, 22, 68, 188, 532, 1444});
  }
}
