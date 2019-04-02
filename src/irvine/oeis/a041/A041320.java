package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041320 Numerators of continued fraction convergents to sqrt(174).
 * @author Sean A. Irvine
 */
public class A041320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041320() {
    super(new long[] {-1, 0, 0, 0, 2902, 0, 0, 0}, new long[] {13, 66, 277, 1451, 38003, 191466, 803867, 4210801});
  }
}
