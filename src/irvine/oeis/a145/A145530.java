package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145530 Numbers x such that there exists n in N with <code>(x+1)^3-x^3=91*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145530() {
    super(new long[] {1, -1455, 1455}, new long[] {5, 8002, 11635629});
  }
}
