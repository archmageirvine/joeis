package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A064476 For an integer k with prime factorization p_1*p_2*p_3* ... *p_m let k* = (p_1+1)*(p_2+1)*(p_3+1)* ... *(p_m+1) (A064478); sequence gives k such that k* is divisible by k.
 * @author Sean A. Irvine
 */
public class A064476 extends Sequence1 {

  private final Sequence mA = new A064478().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mA.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

