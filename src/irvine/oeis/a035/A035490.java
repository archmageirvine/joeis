package irvine.oeis.a035;

import irvine.oeis.InverseSequence;

/**
 * A035490 Step at which card n appears on top of deck for first time in Guy's shuffling problem A035485.
 * @author Sean A. Irvine
 */
public class A035490 extends InverseSequence {

  /** Construct the sequence. */
  public A035490() {
    super(new A035485(), 1, 0);
  }
}

