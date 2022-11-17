package irvine.oeis.a060;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002110;

/**
 * A060388.
 * @author Sean A. Irvine
 */
public class A060389 extends PartialSumSequence {

  /** Construct the sequence. */
  public A060389() {
    super(new SkipSequence(new A002110(), 1));
  }
}
