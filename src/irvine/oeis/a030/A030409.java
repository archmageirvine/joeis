package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030409.
 * @author Sean A. Irvine
 */
public class A030409 extends A030401 {

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

