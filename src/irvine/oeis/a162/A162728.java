package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a117.A117212;

/**
 * A162728 G.f.: x/(1-x) = Sum_{n&gt;=1} a(n)*log(1+x^n)/n.
 * @author Georg Fischer
 */
public class A162728 extends Sequence1 {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A117212());

  @Override
  public Z next() {
    return mSeq.next();
  }
}
