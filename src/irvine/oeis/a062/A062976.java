package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023022;

/**
 * A062976 Half-totient function of n is divisible by the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062976 extends AbstractSequence {

  private final A023022 mSeq1 = new A023022();

  /** Construct the sequence. */
  public A062976() {
    super(3);
  }

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mSeq1.next().mod(Functions.SIGMA0.l(++mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

