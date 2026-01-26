package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A392757 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A392757 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A392757() {
    super(1, 1, 1, (k, m) -> k > m ? null : Functions.FACTORIAL.z(m).multiply(Functions.FACTORIAL.z(k)).add(1));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return super.accept(x, y, n, prev) && n.isProbablePrime();
  }
}
