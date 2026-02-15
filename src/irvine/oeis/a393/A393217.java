package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A393217 Perfect powers m^k, with m, k &gt; 1, such that no digit of m^k is present in k^m.
 * @author Sean A. Irvine
 */
public class A393217 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A393217() {
    super(1, 2, 2, (m, k) -> Z.valueOf(m).pow(k));
  }

  @Override
  protected boolean accept(final long m, final long k, final Z n, final Z prev) {
    return (Functions.SYNDROME.i(n) & Functions.SYNDROME.i(Z.valueOf(k).pow(m))) == 0;
  }
}
