package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019330.
 * @author Sean A. Irvine
 */
public class A019330 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.valueOf(12) : Cyclotomic.cyclotomic(mN, 12);
  }
}

