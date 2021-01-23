package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036494 Nearest integer to n^(9/2).
 * @author Sean A. Irvine
 */
public class A036494 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).pow(9)).sqrt().round();
  }
}

