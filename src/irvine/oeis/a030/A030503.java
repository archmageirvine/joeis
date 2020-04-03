package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030503 <code>Graham-Sloane-type</code> lower bound on the size of a ternary <code>(n,3,3) constant-weight</code> code.
 * @author Sean A. Irvine
 */
public class A030503 implements Sequence {

  private int mN = w() - 1;

  protected int w() {
    return 3;
  }

  @Override
  public Z next() {
    return Binomial.binomial(++mN, w()).shiftLeft(w()).add(2 * mN).divide(2 * mN + 1);
  }
}

