package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000162;
import irvine.oeis.a038.A038119;

/**
 * A007743 Number of n-celled mirror-symmetric solid polyominoes (or polycubes).
 * @author Sean A. Irvine
 */
public class A007743 extends A038119 {

  private final A000162 mA = new A000162();

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
