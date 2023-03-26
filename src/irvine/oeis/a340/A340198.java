package irvine.oeis.a340;
// manually dirichcon/dirichinv at 2023-03-25 21:49

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a319.A319340;

/**
 * A340198 Dirichlet inverse of sequence f(n) = A319340(n)-1 = (A000010(n) + A023900(n) - 1), where A000010 is Euler Totient function phi, and A023900 is its Dirichlet inverse.
 * @author Georg Fischer
 */
public class A340198 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A319340() {
    @Override
    public Z next() {
      return super.next().subtract(1);
    }
  });
  private int mN = 0;

  /** Construct the sequence. */
  public A340198() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq.next();
    return (mN == 1) ? Z.ONE : result;
  }
}
