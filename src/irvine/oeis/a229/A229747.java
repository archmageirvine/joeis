package irvine.oeis.a229;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a207.A207262;

/**
 * A229747 Largest prime factor of 4^(2*n+1)+1.
 * @author Georg Fischer
 */
public class A229747 extends AbstractSequence {

  private final A207262 mSeq1 = new A207262();

  /** Construct the sequence. */
  public A229747() {
    super(0);
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq1.next());
  }
}
