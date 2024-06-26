package irvine.oeis.a222;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A222528 O.g.f.: Sum_{n&gt;=0} (n^8)^n * exp(-n^8*x) * x^n / n!.
 * @author Georg Fischer
 */
public class A222528 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A222528() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING2.z(8L * mN, mN);
  }
}
