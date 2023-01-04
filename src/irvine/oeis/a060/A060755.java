package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060755 a(n) = log_2(A060723(n)).
 * @author Sean A. Irvine
 */
public class A060755 extends A060723 {

  @Override
  public Z next() {
    final Z t = super.next().makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
