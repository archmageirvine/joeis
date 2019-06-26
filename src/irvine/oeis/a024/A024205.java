package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024205 <code>[ (4th</code> elementary symmetric function of S(n))/(2nd elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024205 extends A024198 {

  private final Sequence mA = new SkipSequence(new A024196(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

