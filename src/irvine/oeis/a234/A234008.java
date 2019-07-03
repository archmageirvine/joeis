package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Rot180MidSideCounter;

/**
 * A234008.
 * @author jmason
 */
public class A234008 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 2;
    return Z.valueOf(new Rot180MidSideCounter(mMax, true, false, false).getCuasym().getCounter(mMax));
  }
}
