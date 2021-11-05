package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a047.A047996;
import irvine.oeis.a048.A048805;

/**
 * A052312 Column 1 of triangle A052311.
 * @author Sean A. Irvine
 */
public class A052312 extends A048805 {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A052312() {
    super(new A047996());
  }

  @Override
  public Z next() {
    step();
    final Z res = super.next();
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return res;
  }
}
