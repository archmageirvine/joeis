package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042424 Numerators of continued fraction convergents to sqrt(740).
 * @author Sean A. Irvine
 */
public class A042424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042424() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 18498, 0, 0, 0, 0, 0}, new long[] {27, 109, 136, 1741, 1877, 9249, 501323, 2014541, 2515864, 32204909, 34720773, 171088001});
  }
}
