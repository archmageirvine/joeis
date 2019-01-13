package irvine.oeis.a253;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A253882.
 * @author Sean A. Irvine
 */
public class A253882 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, -1, -1, true, false, false, false));
  }

}

