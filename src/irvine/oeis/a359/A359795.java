package irvine.oeis.a359;
// manually dirichcon/dirichinv at 2023-06-04 21:04

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048675;

/**
 * A359795 Dirichlet inverse of function f(n) = 1 + A048675(n), where A048675(n) is fully additive with a(p) = 2^(1-PrimePi(p)).
 * @author Georg Fischer
 */
public class A359795 extends Sequence1 {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A048675() {
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
