package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A006968 Number of letters in Roman numeral representation of n.
 * @author Sean A. Irvine
 */
public class A006968 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Roman.roman(++mN).length());
  }
}
