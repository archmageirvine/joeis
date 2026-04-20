package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a392.A392200;

/**
 * A394761 a(n) = the length of the n-th run of 1's in A392200.
 * @author Sean A. Irvine
 */
public class A394761 extends Sequence0 {

  private final Sequence mA = new A392200();

  @Override
  public Z next() {
    long cnt = 1;
    while (!mA.next().isOne()) {
      // do nothing
    }
    while (mA.next().isOne()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
