package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106707 First entry of the vector (M^n)v, where M is the 2 X 2 matrix [[0,-1],[1,4]] and v is the column vector [0,1].
 * @author Sean A. Irvine
 */
public class A106707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106707() {
    super(new long[] {-1, 4}, new long[] {0, -1});
  }
}
