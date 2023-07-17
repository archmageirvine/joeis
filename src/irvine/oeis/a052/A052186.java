package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a006.A006932;

/**
 * A052186 Number of permutations of [n] with no strong fixed points.
 * @author Sean A. Irvine
 */
public class A052186 extends A006932 {

  /** Construct the sequence. */
  public A052186() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    final Z t = super.next();
    return mF.subtract(t);
  }
}

