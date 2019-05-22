package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002379;

/**
 * A022808 <code>a(n) = S(n) + c(n)</code> where <code>S(n) = [ (3/2)^n ]</code> and c is the complement of S.
 * @author Sean A. Irvine
 */
public class A022808 implements Sequence {

  private final Sequence mA = new SkipSequence(new A002379(), 1);
  private final Sequence mB = new ComplementSequence(new A002379(), Z.ONE);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
