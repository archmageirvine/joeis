package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001954 Wythoff game.
 * @author Sean A. Irvine
 */
public class A001954 implements Sequence {

  private static final CR N = CR.SQRT2.add(CR.TWO);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(CR.HALF)).floor();
  }
}
