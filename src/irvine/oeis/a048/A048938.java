package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a392.A392325;

/**
 * A048938 8-digit vampire numbers (definition 2).
 * @author Sean A. Irvine
 */
public class A048938 extends A392325 {

  private static final Z LAST = Z.valueOf(96977920);
  private Z mA = super.next();

  /** Construct the sequence. */
  public A048938() {
    super(10, 10025010);
  }

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    final Z res = mA;
    mA = super.next();
    if (LAST.equals(mA)) {
      mA = null;
    }
    return res;
  }
}

