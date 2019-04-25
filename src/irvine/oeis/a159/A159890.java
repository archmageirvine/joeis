package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159890 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+439)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A159890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159890() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {401, 439, 485, 1921, 2195, 2509});
  }
}
