package irvine.oeis.a217;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A217913 O.g.f.: Sum_{n&gt;=0} (n^3)^n * exp(-n^3*x) * x^n / n!.
 * @author Georg Fischer
 */
public class A217913 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A217913() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING2.z(3L * mN, mN);
  }
}
