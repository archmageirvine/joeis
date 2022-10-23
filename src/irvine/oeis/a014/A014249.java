package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001951;
import irvine.oeis.a022.A022838;

/**
 * A014249 a(n) = b(n) - c(n) where b(n) = [n*sqrt(2)] + [n*sqrt(3)] and c(n) is the n-th number not in sequence b.
 * @author Sean A. Irvine
 */
public class A014249 extends Sequence1 {

  private static final class BSequence extends A001951 {
    private final A022838 mA = new A022838();
    {
      super.next();
    }

    @Override
    public Z next() {
      return super.next().add(mA.next());
    }
  }

  private final Sequence mB = new BSequence();
  private final Sequence mComplementB = new ComplementSequence(new BSequence(), Z.ONE);

  @Override
  public Z next() {
    return mB.next().subtract(mComplementB.next());
  }
}
