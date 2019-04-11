package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122174 First row sum of the matrix M^n, where M is the 5 X 5 matrix <code>{{0,-1,-1,-1,-1}, {-1,0,-1,-1,0}, {-1,-1,0,0,0}, {-1,-1,0,1,0}, {-1,0,0,0,1}}</code>.
 * @author Sean A. Irvine
 */
public class A122174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122174() {
    super(new long[] {-1, 7, -13, 5, 2}, new long[] {1, -4, 6, -24, 41});
  }
}
