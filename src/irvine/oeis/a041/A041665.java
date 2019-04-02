package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041665 Denominators of continued fraction convergents to sqrt(351).
 * @author Sean A. Irvine
 */
public class A041665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041665() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124850, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 15, 34, 83, 200, 683, 883, 2449, 3332, 122401, 125733, 373867, 499600, 1872667, 4244934, 10362535, 24970004, 85272547, 110242551, 305757649, 416000200});
  }
}
