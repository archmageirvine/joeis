package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216034 <code>a(n) = 3^(-1+floor((n+1)/3))*A(n)</code>, where <code>A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3</code> with <code>A(0)=A(1)=3, A(2)=11</code>.
 * @author Sean A. Irvine
 */
public class A216034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216034() {
    super(new long[] {-1, 0, 0, 33, 0, 0, 105, 0, 0}, new long[] {1, 1, 11, 35, 115, 1129, 3697, 12105, 118907});
  }
}
