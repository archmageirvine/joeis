package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002212;

/**
 * A045635 Catafusenes (see references for precise definition).
 * @author Sean A. Irvine
 */
public class A045635 extends ConvolutionSequence {

  private static final class MySequence extends PrependSequence {
    private MySequence() {
      super(1, new SkipSequence(new A002212(), 1), 0);
    }
  }

  /** Construct the sequence. */
  public A045635() {
    super(new MySequence(), new ConvolutionSequence(new MySequence(), new MySequence()));
    next();
  }
}
