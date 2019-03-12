package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019328.
 * @author Sean A. Irvine
 */
public class A019328 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TEN : Cyclotomic.cyclotomic(mN, 10);
  }
}

