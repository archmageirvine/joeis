package irvine.oeis.a051;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014197;
import irvine.oeis.transform.EulerTransform;

/**
 * A051894 Number of monic polynomials with integer coefficients of degree n with all roots in unit disc.
 * @author Sean A. Irvine
 */
public class A051894 extends EulerTransform {

  /** Construct the sequence. */
  public A051894() {
    super(0, new PrependSequence(new SkipSequence(new A014197(), 1), 3), 1);
  }
}
