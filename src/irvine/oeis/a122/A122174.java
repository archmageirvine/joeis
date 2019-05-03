package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122174 First row sum of the matrix <code>M^n</code>, where M is the <code>5 X 5</code> matrix <code>{{0,-1,-1,-1,-1}, {-1,0,-1,-1,0}, {-1,-1,0,0,0}, {-1,-1,0,1,0}, {-1,0,0,0,1}}</code>.
 * @author Sean A. Irvine
 */
public class A122174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122174() {
    super(new long[] {-1, 7, -13, 5, 2}, new long[] {1, -4, 6, -24, 41});
  }
}
