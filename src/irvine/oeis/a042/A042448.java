package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042448 Numerators of continued fraction convergents to <code>sqrt(752)</code>.
 * @author Sean A. Irvine
 */
public class A042448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042448() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9214, 0, 0, 0, 0, 0, 0, 0}, new long[] {27, 55, 137, 192, 521, 713, 1947, 4607, 250725, 506057, 1262839, 1768896, 4800631, 6569527, 17939685, 42448897});
  }
}
