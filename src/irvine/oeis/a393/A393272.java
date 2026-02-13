package irvine.oeis.a393;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a277.A277473;

/**
 * A393272 allocated for M\u00e9lika Tebni.
 * @author Sean A. Irvine
 */
public class A393272 extends PartialSumSequence {

  /** Construct the sequence. */
  public A393272() {
    super(0, new A277473());
  }
}
