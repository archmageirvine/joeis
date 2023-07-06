package irvine.oeis.a066;
// manually modified; dirichcon at 2021-04-24 14:59

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000045;

/**
 * A066769 a(n) = Sum_{d|n} d*Fibonacci(n/d).
 * @author Georg Fischer
 */
public class A066769 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A066769() {
    super(new A000027(), 1, new A000045().skip(1), 1);
    // mSeq2.next();
  }
}
