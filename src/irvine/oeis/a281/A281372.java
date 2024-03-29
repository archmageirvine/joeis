package irvine.oeis.a281;
// Generated by gen_seq4.pl simple3 at 2023-03-24 09:26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001158;

/**
 * A281372 Coefficients in q-expansion of (E_2*E_4 - E_6)/720, where E_2, E_4, E_6 are the Eisenstein series shown in A006352, A004009, A013973, respectively.
 * @author Georg Fischer
 */
public class A281372 extends AbstractSequence {

  private int mN = -1;
  private final A001158 mSeq = new A001158();

  /** Construct the sequence. */
  public A281372() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.valueOf(mN).multiply(mSeq.next());
  }
}
