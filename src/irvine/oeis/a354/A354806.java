package irvine.oeis.a354;
// manually dirichcon/dirichinv0 at 2023-06-04 21:23

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003415;

/**
 * A354806 Parity of Dirichlet inverse of {A003415, arithmetic derivative of n + A063524 (1, 0, 0, 0, ...)}.
 * @author Georg Fischer
 */
public class A354806 extends Sequence1 {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new SkipSequence(new A003415(), 1));

  @Override
  public Z next() {
    return mSeq.next().and(Z.ONE);
  }
}
