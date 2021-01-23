package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036495 Nearest integer to n^(11/2).
 * @author Sean A. Irvine
 */
public class A036495 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).pow(11)).sqrt().round();
  }
}

