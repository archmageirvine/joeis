package irvine.oeis.a087;

import irvine.math.z.Z;

/**
 * A087033 Number of terms in each group of consecutive zeros in A087032.
 * @author Sean A. Irvine
 */
public class A087033 extends A087032 {

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    long cnt = 1;
    while (super.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
