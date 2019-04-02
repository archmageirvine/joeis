package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125501 The (1,1)-entry in the matrix M^n, where M is the 7 X 7 Cartan matrix [2,-1,0,0,0,0,0; -1,2,-1,0,0,0,0; 0,-1,2,-1,0,0,-1; 0,0,-1,2,-1,0,0; 0,0,0,-1,2,-1,0; 0,0,0,0,-1,2,0; 0,0,-1,0,0,0,2].
 * @author Sean A. Irvine
 */
public class A125501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125501() {
    super(new long[] {-1, 36, -105, 112, -54, 12}, new long[] {1, 2, 5, 14, 42, 132});
  }
}
