package irvine.oeis.a111;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A111358.
 * @author Sean A. Irvine
 */
public class A111358 implements Sequence {

  private int mN = 11;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, 5, -1, false, false, false, false));
  }
}

