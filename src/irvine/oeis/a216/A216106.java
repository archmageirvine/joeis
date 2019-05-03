package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216106 The Wiener index of the tetrameric <code>1,3-adamantane TA(n) (see</code> the Fath-Tabar et al. <code>reference)</code>.
 * @author Sean A. Irvine
 */
public class A216106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216106() {
    super(new long[] {-1, 4, -6, 4}, new long[] {96, 652, 1968, 4344});
  }
}
