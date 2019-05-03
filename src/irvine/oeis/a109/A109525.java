package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109525 <code>a(n)=the</code> sum of the <code>(1,2)-</code> and <code>(1,3)-entries</code> and twice the <code>(1,4)-entry</code> of the matrix <code>P^n + T^n</code>, where the <code>4 X 4</code> matrices P and T are defined by <code>P=[0,1,0,0;0,0,1,0;0,0,0,1;1,0,0,0]</code> and <code>T=[0,1,0,0;0,0,1,0;0,0,0,1;1,1,1,1]</code>.
 * @author Sean A. Irvine
 */
public class A109525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109525() {
    super(new long[] {-1, -1, -1, -1, 2, 1, 1, 1}, new long[] {0, 2, 2, 4, 4, 9, 16, 31});
  }
}
