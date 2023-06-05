package irvine.oeis.a359;
// manually dirichcon/dirichinv0 at 2023-06-04 21:04

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003415;

/**
 * A359790 Dirichlet inverse of function f(n) = 1 + n', where n' stands for the arithmetic derivative of n, A003415(n).
 * @author Georg Fischer
 */
public class A359790 extends Sequence1 {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A003415() {
    {
      super.next();
    }

    @Override
    public Z next() {
      return super.next().add(1);
    }
  });

  @Override
  public Z next() {
    return mSeq.next();
  }
}
