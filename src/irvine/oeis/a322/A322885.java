package irvine.oeis.a322;

import irvine.math.z.Z;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a010.A010057;
import irvine.oeis.a046.A046951;

/**
 * A322885 Number of 3-generated Abelian groups of order n.
 * @author Georg Fischer
 */
public class A322885 extends Sequence1 {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A010057(), 0, new A046951(), 1);

  @Override
  public Z next() {
    return mSeq.next();
  }
}
