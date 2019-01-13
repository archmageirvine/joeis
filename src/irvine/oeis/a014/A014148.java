package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007504;

/**
 * A014148.
 * @author Sean A. Irvine
 */
public class A014148 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014148() {
    super(new SkipSequence(new A007504(), 1));
  }
}
