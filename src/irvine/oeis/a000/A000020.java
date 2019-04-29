package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a011.A011260;

/**
 * A000020 Number of primitive polynomials of degree n over <code>GF(2)</code>.
 * @author Sean A. Irvine
 */
public class A000020 extends PrependSequence {

  /** Construct the sequence. */
  public A000020() {
    super(new SkipSequence(new A011260(), 1), Z.TWO);
  }
}

