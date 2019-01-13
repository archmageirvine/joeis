package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001349;

/**
 * A000719.
 * @author Sean A. Irvine
 */
public class A000719 extends A000088 {

  private final A001349 mS = new A001349();

  @Override
  public Z next() {
    return super.next().subtract(mS.next());
  }
}
