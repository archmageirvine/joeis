package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109526 a(n)=the sum of the (1,2)- and (1,3)-entries and twice the (1,4)-entry of the matrix P^n + T^n, where the 4 X 4 matrices P and T are defined by P=[0,1,0,0;0,0,1,0;0,0,0,1;1,0,0,0] and T=[0,1,0,0;0,0,1,0;0,0,0,1;1,0,0,1].
 * @author Sean A. Irvine
 */
public class A109526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109526() {
    super(new long[] {-1, 0, 0, -1, 2, 0, 0, 1}, new long[] {0, 2, 2, 4, 2, 4, 5, 8});
  }
}
