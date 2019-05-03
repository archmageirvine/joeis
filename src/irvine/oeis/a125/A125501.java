package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125501 The <code>(1,1)-entry</code> in the matrix <code>M^n</code>, where M is the <code>7 X 7</code> Cartan matrix <code>[2,-1,0,0,0,0,0; -1,2,-1,0,0,0,0; 0,-1,2,-1,0,0,-1; 0,0,-1,2,-1,0,0; 0,0,0,-1,2,-1,0; 0,0,0,0,-1,2,0; 0,0,-1,0,0,0,2]</code>.
 * @author Sean A. Irvine
 */
public class A125501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125501() {
    super(new long[] {-1, 36, -105, 112, -54, 12}, new long[] {1, 2, 5, 14, 42, 132});
  }
}
