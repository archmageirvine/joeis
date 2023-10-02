package irvine.oeis.a354;
// manually 2023-09-29/gcd3an at 2023-09-29 10:00

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055615;
import irvine.oeis.a064.A064989;

/**
 * A354366 Denominators of Dirichlet inverse of primorial deflation fraction A319626(n) / A319627(n).
 * a(n) = A064989(n) / gcd(A055615(n), A064989(n))
 * @author Georg Fischer
 */
public class A354366 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A064989();
  private final AbstractSequence mSeq2 = new A055615();

  /** Construct the sequence. */
  public A354366() {
    super(1);
  }

  @Override
  public Z next() {
    final Z t1 = mSeq1.next();
    return t1.divide(mSeq2.next().gcd(t1));
  }
}

