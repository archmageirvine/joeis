package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a011.A011782;

/**
 * A045678 Number of 2n-bead balanced binary necklaces which are equivalent to their reversed complement, but not equivalent to their reverse and complement.
 * @author Sean A. Irvine
 */
public class A045678 extends A011782 {

  private final Sequence mA = new A045674();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
