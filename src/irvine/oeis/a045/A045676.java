package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a128.A128014;

/**
 * A045676 Number of 2n-bead balanced binary necklaces which are equivalent to their reverse, but not equivalent to their complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045676 extends A128014 {

  private final Sequence mA = new A045674();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
