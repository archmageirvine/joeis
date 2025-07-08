package irvine.oeis.a096;

import irvine.oeis.PrependSequence;
import irvine.oeis.a093.A093419;

/**
 * A096620 Denominator of -3*n + 2*(1+n)*HarmonicNumber(n).
 * @author Georg Fischer
 */
public class A096620 extends PrependSequence {

  /** Construct the sequence. */
  public A096620() {
    super(0, new A093419(), 1);
  }
}
