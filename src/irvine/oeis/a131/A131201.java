package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131201 Period 24: repeat [0,1,2,5,2,9,0,9,8,5,8,1,0,-1,-2,-5,-2,-9,0,-9,-8,-5,-8,-1].
 * @author Sean A. Irvine
 */
public class A131201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131201() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 5, 2, 9, 0, 9, 8, 5, 8, 1});
  }
}
