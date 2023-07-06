package irvine.oeis.a349;
// manually dirichcon/dirichinv at 2023-03-25 20:24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a000.A000108;

/**
 * A349449 Dirichlet inverse of Catalan numbers, when started from A000108(1): 1, 2, 5, 14, 42, ...
 * @author Georg Fischer
 */
public class A349449 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A000108().skip(1));

  /** Construct the sequence. */
  public A349449() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
