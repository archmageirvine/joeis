package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a038.A038040;

/**
 * A145229 Coefficients in expansion of E&apos;_1(q).
 * @author Georg Fischer
 */
public class A145229 extends Sequence0 {

  private final A038040 mSeq = new A038040();

  @Override
  public Z next() {
    return mSeq.next().multiply(4);
  }
}
