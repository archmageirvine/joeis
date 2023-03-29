package irvine.oeis.a145;
// manually  at 2023-03-26

import irvine.math.z.Z;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007429;
import irvine.oeis.recur.PaddingSequence;

/**
 * A145396 a(n) = Sum_{d|n} sigma(d) + 3*Sum_{2c|n} sigma(c).
 * @author Georg Fischer
 */
public class A145396 extends Sequence1 {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A007429(), 1,
    new PaddingSequence("0, 1, 3", "0"), 0);

  @Override
  public Z next() {
    return mSeq.next();
  }
}
