package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046031 Digits are cubes.
 * @author Sean A. Irvine
 */
public class A046031 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 3).replace('2', '8'));
  }
}
