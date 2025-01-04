package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A135318 The Kentucky-2 sequence: a(n) = a(n-2) + 2*a(n-4), with a[0..3] = [1, 1, 1, 2].
 * @author Sean A. Irvine
 */
public class A135318 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A135318() {
    super(new long[] {2, 0, 1, 0}, new long[] {1, 1, 1, 2});
  }

  @Override
  public Z a(final Z n) {
    // a(n) = (2^floor(n/2)*(5-(-1)^n)+(-1)^floor(n/2)*(1+(-1)^n))/6
    return Z.TWO.pow(n.divide2()).multiply(Z.FIVE.subtract(n.testBit(0) ? Z.NEG_ONE : Z.ONE))
      .add((n.divide2().testBit(0) ? Z.NEG_ONE : Z.ONE).multiply(Z.ONE.add(n.testBit(0) ? Z.NEG_ONE : Z.ONE))).divide(6);
  }

  @Override
  public Z a(final int n) {
    return Z.TWO.pow(n / 2).multiply(5 - (((n & 1) == 1) ? -1 : 1)).add((((n / 2) & 1) == 1 ? -1 : 1) * (1 + (((n & 1) == 1) ? -1 : 1))).divide(6);
  }

}
