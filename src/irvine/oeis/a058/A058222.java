package irvine.oeis.a058;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058222 Tree of tournament sequences read across rows.
 * @author Sean A. Irvine
 */
public class A058222 extends Sequence0 {

  private final LinkedList<Long> mA = new LinkedList<>();
  {
    mA.add(1L);
  }

  @Override
  public Z next() {
    final long res = mA.pollFirst();
    for (long k = 0, j = res; k < res; ++k) {
      mA.add(++j);
    }
    return Z.valueOf(res);
  }
}

