package irvine.oeis.a002;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002880 Number of 3-connected nets with n edges.
 * @author Sean A. Irvine
 */
public class A002880 implements Sequence {

  private int mN = 7;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, 3, 4, -1, false, false, true, true));
  }

}

