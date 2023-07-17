package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002905;

/**
 * A003089 Number of connected line graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003089 extends A002905 {

  /** Construct the sequence. */
  public A003089() {
    super(1);
  }

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return mN == 4 ? Z.TWO : t;
  }
}
