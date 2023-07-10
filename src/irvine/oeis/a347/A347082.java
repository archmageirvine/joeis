package irvine.oeis.a347;
// manually at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a168.A168036;

/**
 * A347082 Dirichlet inverse of -A168036, n - A003415(n).
 * @author Georg Fischer
 */
public class A347082 extends Sequence1 {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(1, new A168036() {
    {
      skip(1);
    }

    @Override
    public Z next() {
      return super.next().negate();
    }
  });

  @Override
  public Z next() {
    return mSeq.next();
  }
}
