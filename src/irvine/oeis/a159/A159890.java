package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159890 Positive numbers y such that y^2 is of the form x^2+(x+439)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159890() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {401, 439, 485, 1921, 2195, 2509});
  }
}
