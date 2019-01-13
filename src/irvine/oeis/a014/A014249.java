package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001951;
import irvine.oeis.a022.A022838;

/**
 * A014249.
 * @author Sean A. Irvine
 */
public class A014249 implements Sequence {

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
