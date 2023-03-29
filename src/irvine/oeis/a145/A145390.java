package irvine.oeis.a145;
// manually  at 2023-03-26

import irvine.math.z.Z;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000012;
import irvine.oeis.a098.A098178;

/**
 * A145390 Number of sublattices of index n of a centered rectangular lattice fixed by a reflection.
 * @author Georg Fischer
 */
public class A145390 extends Sequence1 {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000012(), 0, new A098178(), 0);

  @Override
  public Z next() {
    return mSeq.next();
  }
}
