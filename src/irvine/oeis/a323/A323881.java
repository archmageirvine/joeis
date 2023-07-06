package irvine.oeis.a323;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a126.A126760;

/**
 * A323881 Dirichlet inverse of A126760.
 * @author Georg Fischer
 */
public class A323881 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A126760().skip());

  /** Construct the sequence. */
  public A323881() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
