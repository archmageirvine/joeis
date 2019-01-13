package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Roman;

/**
 * A006968.
 * @author Sean A. Irvine
 */
public class A006968 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Roman.roman(++mN).length());
  }
}
