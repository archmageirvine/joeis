package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a048.A048805;

/**
 * A052309 Column 1 of triangle A052308.
 * @author Sean A. Irvine
 */
public class A052309 extends A048805 {

  {
    setOffset(1);
  }

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A052309() {
    super(new A052307());
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
