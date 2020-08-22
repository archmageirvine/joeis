package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001951;

/**
 * A022807 a(n) = S(n) + c(n) where S(n) = [ n*sqrt(2) ] + [ n*sqrt(3) ] and c is the complement of S.
 * @author Sean A. Irvine
 */
public class A022807 implements Sequence {

  private static class MySequence extends A022838 {
    private final Sequence mA = new A001951();
    {
      mA.next(); // skip 0th
    }

    @Override
    public Z next() {
      return super.next().add(mA.next());
    }
  }

  private final Sequence mA = new MySequence();
  private final Sequence mB = new ComplementSequence(new MySequence(), Z.ONE);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
