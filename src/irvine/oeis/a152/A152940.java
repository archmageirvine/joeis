package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056911;
import irvine.oeis.a160.A160338;

/**
 * A152940 Odd squarefree numbers n such that the cyclotomic polynomial Phi(n,x) has height 2.
 * @author Georg Fischer
 */
public class A152940 extends FilterSequence {

  /** Construct the sequence. */
  public A152940() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first ind
   * @param h desired heigth = absolute maximum value of coefficients
   */
  public A152940(final int offset, final int h) {
    super(offset, new A056911(), t -> A160338.height(Cyclotomic.cyclotomic(t.intValue())).equals(Z.valueOf(h)));
  }

}
