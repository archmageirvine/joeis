package irvine.oeis.a133;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;

/**
 * A133041 Sum of n and partition number of n.
 * @author Georg Fischer
 */
public class A133041 implements Sequence {

  final Sequence mA000041 = new A000041();
  protected long mN;
  /** Construct the sequence. */
  public A133041() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mA000041.next());
  }

}
