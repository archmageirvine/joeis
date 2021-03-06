package irvine.oeis.a161;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001147;

/**
 * A161124 Number of inversions in all fixed-point-free involutions of {1,2,...,2n}.
 * @author Georg Fischer
 */
public class A161124 implements Sequence {

  final Sequence mA001147 = new A001147();
  protected long mN;
  /** Construct the sequence. */
  public A161124() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(Z.TWO).multiply(mA001147.next());
  }

}
