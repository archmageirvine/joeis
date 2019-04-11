package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095797 T(n,k) for <code>k=0..3</code> is the k-th component of the vector obtained by multiplying the n-th power of the 4 X 4 matrix <code>(1,1,1,1</code>; 7,3,1,0; 12,2,0,0; 6,0,0,0) with the vector <code>(1,1,1,1)</code>.
 * @author Sean A. Irvine
 */
public class A095797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095797() {
    super(new long[] {-12, 0, 0, 0, -30, 0, 0, 0, 24, 0, 0, 0, 4, 0, 0, 0}, new long[] {1, 1, 1, 1, 4, 11, 14, 6, 35, 75, 70, 24, 204, 540, 570, 210});
  }
}
