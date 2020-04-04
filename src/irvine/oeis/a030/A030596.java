package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030596 Length of n-th run of digit 1 in <code>A030588</code>.
 * @author Sean A. Irvine
 */
public class A030596 extends A030588 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ONE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

