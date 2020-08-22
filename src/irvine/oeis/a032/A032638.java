package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032638 a(n) = floor( exp(n) / Pi ).
 * @author Sean A. Irvine
 */
public class A032638 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN)).exp().divide(CR.PI).floor();
  }
}
