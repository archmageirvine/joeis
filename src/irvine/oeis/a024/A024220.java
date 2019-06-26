package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000326;

/**
 * A024220 <code>a(n) = [ (3rd</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+2</code> positive integers congruent to <code>1 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024220 extends A024213 {

  private Sequence mA = new SkipSequence(new A000326(), 3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

