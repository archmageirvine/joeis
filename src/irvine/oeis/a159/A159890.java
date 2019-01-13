package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159890.
 * @author Sean A. Irvine
 */
public class A159890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159890() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {401, 439, 485, 1921, 2195, 2509});
  }
}
