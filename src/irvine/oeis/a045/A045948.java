package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003418;
import irvine.oeis.a034.A034386;

/**
 * A045948 a(n) = A003418(n)/A034386(n).
 * @author Sean A. Irvine
 */
public class A045948 extends A003418 {

  private final Sequence mA = new A034386();
  {
    next(); // skip 0th term
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
