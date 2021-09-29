package irvine.oeis.a056;
// manually diffseq at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a013.A013940;
/**
 * A056170 Number of non-unitary prime divisors of n.
 * @author Georg Fischer
 */
public class A056170 extends DifferenceSequence {

  /** Construct the sequence. */
  public A056170() {
    super(new A013940());
  }
  
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ZERO : super.next();
  }
  
}
