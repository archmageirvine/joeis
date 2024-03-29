package irvine.oeis.a243;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061395;

/**
 * A243291 Difference between n and the index of its largest prime factor: a(n) = n - A061395(n).
 * @author Georg Fischer
 */
public class A243291 extends Sequence1 {

  final Sequence mA061395 = new A061395();
  protected long mN;
  /** Construct the sequence. */
  public A243291() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA061395.next());
  }

}
