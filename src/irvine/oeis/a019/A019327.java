package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019327.
 * @author Sean A. Irvine
 */
public class A019327 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.NINE : Cyclotomic.cyclotomic(mN, 9);
  }
}

