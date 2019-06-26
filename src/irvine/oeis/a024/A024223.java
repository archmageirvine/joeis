package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024223 <code>[ (4th</code> elementary symmetric function of S(n))/(2nd elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> positive integers congruent to <code>1 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024223 extends A024214 {

  private Sequence mA = new SkipSequence(new A024212(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

