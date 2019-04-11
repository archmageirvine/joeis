package irvine.oeis.a007;

import irvine.oeis.PeriodicSequence;

/**
 * A007877 Period 4 zigzag sequence: repeat <code>[0,1,2,1]</code>.
 * @author Sean A. Irvine
 */
public class A007877 extends PeriodicSequence {

  /** Construct the sequence. */
  public A007877() {
    super(0, 1, 2, 1);
  }
}
