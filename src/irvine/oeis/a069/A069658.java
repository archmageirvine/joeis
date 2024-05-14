package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a017.A017934;

/**
 * A069658 a(1) = 1; a(n) = smallest nontrivial n-digit perfect power.
 * @author Sean A. Irvine
 */
public class A069658 extends Sequence1 {

  private final Sequence mA = new A017934().skip();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return mA.next().add(1).square();
  }
}

