package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007395.
 * @author Sean A. Irvine
 */
public class A007395 implements Sequence {

  @Override
  public Z next() {
    return Z.TWO;
  }
}
