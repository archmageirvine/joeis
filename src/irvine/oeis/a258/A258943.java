package irvine.oeis.a258;

import irvine.oeis.a000.A000045;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A258943 Exponential reversion of Fibonacci numbers A000045.
 * @author Georg Fischer
 */
public class A258943 extends ExponentialRevertTransformSequence {


  /** Construct the sequence. */
  public A258943() {
    super(1, new A000045().skip(1));
  }

}
