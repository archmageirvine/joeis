package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a086.A086786;

/**
 * A087310 Common differences of arithmetic progressions in A086786.
 * @author Sean A. Irvine
 */
public class A087310 extends A086786 {

  /** Construct the sequence. */
  public A087310() {
    super(2);
  }

  @Override
  public Z next() {
    mRow.clear();
    step();
    final long t = mRow.pollFirst();
    return Z.valueOf(mRow.peekFirst() - t);
  }
}
