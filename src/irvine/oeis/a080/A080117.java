package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a055.A055094;
import irvine.oeis.a065.A065091;

/**
 * A080117 Binary encoding of quadratic residue set formed for n-th prime, coerced to "complementarily symmetric binary sequence" with A080261 if the prime is of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A080117 extends Sequence2 {

  private final DirectSequence mA = new A055094();
  private final DirectSequence mB = new A080261();
  private final Sequence mOddPrimes = new A065091();

  @Override
  public Z next() {
    final Z p = mOddPrimes.next();
    final Z c = mA.a(p);
    return p.mod(4) == 3 ? c : mB.a(c);
  }
}

