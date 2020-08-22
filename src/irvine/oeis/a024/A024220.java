package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000326;

/**
 * A024220 a(n) = [ (3rd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+2 positive integers congruent to 1 mod 3}.
 * @author Sean A. Irvine
 */
public class A024220 extends A024213 {

  private Sequence mA = new SkipSequence(new A000326(), 3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

