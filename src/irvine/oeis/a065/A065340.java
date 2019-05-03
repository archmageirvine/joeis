package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065340 Third diagonal of triangle in <code>A046740</code>.
 * @author Sean A. Irvine
 */
public class A065340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065340() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {2, 28, 182, 864, 3474, 12660});
  }
}
