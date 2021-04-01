package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003999;

/**
 * A046039 Numbers which cannot be represented as a sum of distinct 4th powers.
 * @author Sean A. Irvine
 */
public class A046039 extends ComplementSequence {

  private boolean mDone = false;

  /** Construct the sequence. */
  public A046039() {
    super(new A003999(), Z.TWO);
  }

  @Override
  public Z next() {
    if (mDone) {
      return null;
    }
    final Z t = super.next();
    if (t.longValueExact() == 5134240) {
      mDone = true;
    }
    return t;
  }
}
