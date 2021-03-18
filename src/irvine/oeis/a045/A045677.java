package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000013;

/**
 * A045677 Number of 2n-bead balanced binary necklaces which are equivalent to their complement, but not equivalent to their reverse and their reversed complement.
 * @author Sean A. Irvine
 */
public class A045677 extends A000013 {

  private final Sequence mA = new A045674();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
