package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053463 First digit of sin(n).
 * @author Sean A. Irvine
 */
public class A053463 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sin().multiply(10).abs().floor().mod(Z.TEN);
  }
}
