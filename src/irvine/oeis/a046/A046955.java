package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046955 Numbers k such that sec(k) decreases monotonically to 1 (or cos(k) increases to 1).
 * @author Sean A. Irvine
 */
public class A046955 implements Sequence {

  private final Convergents mC = new Convergents(CR.TAU);
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return mC.next().num();
  }
}
