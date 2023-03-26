package irvine.oeis.a226;
// manually dirichcon/dirichcon2 at 2023-03-25 19:35

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a034.A034444;
import irvine.oeis.a056.A056624;

/**
 * A226602 Number of ordered triples (i,j,k) with i*j*k = n, i,j,k &gt;= 0 and gcd(i,j,k) &lt;= 1.
 * @author Georg Fischer
 */
public class A226602 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A034444(), 1, new A056624(), 1);
  private int mN = 0;

  /** Construct the sequence. */
  public A226602() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : mSeq.next();
  }
}
