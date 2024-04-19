package irvine.oeis.a339;
// manually andiv 

import irvine.math.LongUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a056.A056789;

/**
 * A339384 a(n) = Sum_{k=1..n} (lcm(n,k)/gcd(n,k) mod n).
 * @author Georg Fischer
 */
public class A339384 extends AbstractSequence {

  private final A056789 mSeq1 = new A056789();
  private int mN;

  /** Construct the sequence. */
  public A339384() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    // a(n) = A056789(n) - n * Sum_{k=1..n} (floor(k / gcd(n,k)^2)).
    ++mN;
    return mSeq1.next().subtract(Integers.SINGLETON.sum(1, mN,
      k -> Z.valueOf(k).divide(Z.valueOf(LongUtils.gcd(mN, k)).square())).multiply(mN));
  }
}
