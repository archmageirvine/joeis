package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a011.A011260;

/**
 * A000020 Number of primitive polynomials of degree n over GF(2).
 * @author Sean A. Irvine
 */
public class A000020 extends PrependSequence {

  /** Construct the sequence. */
  public A000020() {
    super(1, new A011260().skip(1), Z.TWO);
  }
}

