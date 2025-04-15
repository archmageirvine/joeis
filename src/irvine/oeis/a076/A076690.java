package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076690 Nearest integer to average of the smallest and largest prime factors of n (0.5 is rounded to 1).
 * @author Sean A. Irvine
 */
public class A076690 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf((Functions.GPF.l(++mN) + Functions.LPF.l(mN) + 1) / 2);
  }
}
