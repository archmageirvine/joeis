package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002379;

/**
 * A022808 a(n) = S(n) + c(n) where S(n) = [ (3/2)^n ] and c is the complement of S.
 * @author Sean A. Irvine
 */
public class A022808 extends Sequence1 {

  private final Sequence mA = new SkipSequence(new A002379(), 1);
  private final Sequence mB = new ComplementSequence(new A002379(), Z.ONE);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
