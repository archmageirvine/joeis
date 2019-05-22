package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a054.A054385;

/**
 * A022806 <code>a(n) = B(n) + c(n)</code> where <code>B(n)</code> is Beatty sequence <code>[ n*e ]</code> and c is the complement of B.
 * @author Sean A. Irvine
 */
public class A022806 implements Sequence {

  private final Sequence mA = new SkipSequence(new A022843(), 1);
  private final Sequence mB = new A054385();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
