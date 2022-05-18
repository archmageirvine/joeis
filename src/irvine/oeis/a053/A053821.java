package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053821 A discrete approximation to log(n): Sum_{ d divides n } A029833(d).
 * @author Sean A. Irvine
 */
public class A053821 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      sum += Math.round(Math.log(p.doubleValue()));
    }
    return Z.valueOf(sum);
  }
}

