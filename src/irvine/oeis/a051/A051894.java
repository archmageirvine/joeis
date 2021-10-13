package irvine.oeis.a051;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014197;

/**
 * A051894 Number of monic polynomials with integer coefficients of degree n with all roots in unit disc.
 * @author Sean A. Irvine
 */
public class A051894 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A051894() {
    super(new PrependSequence(new SkipSequence(new A014197(), 1), 3), 0);
  }
}
