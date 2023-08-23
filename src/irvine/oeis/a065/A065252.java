package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065252 The sequence A065251 reduced modulo 3 (i.e., replace every -1 with 2).
 * @author Sean A. Irvine
 */
public class A065252 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((4 - (++mN - (1L << LongUtils.lg(mN))) % 3) % 3);
  }
}
