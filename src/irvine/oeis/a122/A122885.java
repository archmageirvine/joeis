package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122885 The <code>(3</code>,3)-entry in the n-th power of the 3 X 3 matrix M <code>= [1,1,1</code>; 4,2,1; <code>9,3,1]</code>.
 * @author Sean A. Irvine
 */
public class A122885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122885() {
    super(new long[] {-2, 11, 4}, new long[] {1, 13, 61});
  }
}
