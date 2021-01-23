package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000079;

/**
 * A011782 Coefficients of expansion of (1-x)/(1-2*x) in powers of x.
 * @author Sean A. Irvine
 */
public class A011782 extends PrependSequence {

  /** Construct the sequence. */
  public A011782() {
    super(new A000079(), Z.ONE);
  }
}
