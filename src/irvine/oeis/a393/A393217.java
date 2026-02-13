package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A393217 allocated for Gonzalo Mart\u00ednez.
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
