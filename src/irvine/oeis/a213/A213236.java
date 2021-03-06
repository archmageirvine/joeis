package irvine.oeis.a213;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000169;

/**
 * A213236 a(n) = (-n)^(n-1).
 * @author Georg Fischer
 */
public class A213236 implements Sequence {

  final Sequence mA000169 = new A000169();
  protected long mN;
  /** Construct the sequence. */
  public A213236() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.ZERO.subtract(((mN & 1L) == 0 ? Z.ONE : Z.NEG_ONE).multiply(mA000169.next()));
  }

}
