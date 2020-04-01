package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030421.
 * @author Sean A. Irvine
 */
public class A030421 extends A030413 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.TWO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

