package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036488 Nearest integer to n^(5/2).
 * @author Sean A. Irvine
 */
public class A036488 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).pow(5)).sqrt().round();
  }
}

