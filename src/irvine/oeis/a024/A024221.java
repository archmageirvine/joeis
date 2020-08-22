package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000326;

/**
 * A024221 [ (4th elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+3 positive integers congruent to 1 mod 3}.
 * @author Sean A. Irvine
 */
public class A024221 extends A024214 {

  private Sequence mA = new SkipSequence(new A000326(), 4);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

