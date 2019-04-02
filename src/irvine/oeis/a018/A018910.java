package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018910 Pisot sequence L(4,5).
 * @author Sean A. Irvine
 */
public class A018910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018910() {
    super(new long[] {-1, 0, 2}, new long[] {4, 5, 7});
  }
}
