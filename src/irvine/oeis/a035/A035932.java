package irvine.oeis.a035;

import irvine.oeis.PositionOfNSequence;

/**
 * A035932 Smallest number that takes n steps to reach 0 under "k-&gt;max product of 2 numbers whose concatenation is k".
 * @author Sean A. Irvine
 */
public class A035932 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A035932() {
    super(new A035931(), 0, 0);
  }
}

