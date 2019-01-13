package irvine.oeis.a011;

import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011371.
 * @author Sean A. Irvine
 */
public class A011371 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - PopCount.popcount(mN));
  }
}

