package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-21/dirichcon2 at 2024-02-21 19:48

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a034.A034444;
import irvine.oeis.a048.A048691;

/**
 * A370297 Inverse Moebius transform of A322328.
 * @author Georg Fischer
 */
public class A370297 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A034444(), 1, new A048691(), 1);

  /** Construct the sequence. */
  public A370297() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
