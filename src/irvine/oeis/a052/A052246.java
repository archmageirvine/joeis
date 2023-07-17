package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A052246 Concatenation of integers from n down to 0.
 * @author Sean A. Irvine
 */
public class A052246 extends A000422 {

  /** Construct the sequence. */
  public A052246() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(10);
  }
}

