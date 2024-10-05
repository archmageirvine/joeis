package irvine.oeis.a013;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A013974 Eisenstein series E_10(q) (alternate convention E_5(q)).
 * @author Georg Fischer
 */
public class A013974 extends LambdaSequence {

  protected A013974(final int offset) {
    super(0, n -> (n == 0) ? Z.ONE : Z.valueOf(-264).multiply(Functions.SIGMA.z(9, n)));
    setOffset(offset);
  }

  /** Construct the sequence. */
  public A013974() {
    this(0);
  }
}
