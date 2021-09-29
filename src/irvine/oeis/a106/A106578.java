package irvine.oeis.a106;
// manually diffseq at 2021-09-27 19:03

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a046.A046098;
/**
 * A106578 First differences of indices of squarefree central binomial numbers.
 * @author Georg Fischer
 */
public class A106578 extends DifferenceSequence {

  /** Construct the sequence. */
  public A106578() {
    super(new A046098());
    next();
  }
}
