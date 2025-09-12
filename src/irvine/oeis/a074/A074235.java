package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a009.A009012;

/**
 * A074235 Numbers that cannot be a long leg of an integer right triangle.
 * @author Sean A. Irvine
 */
public class A074235 extends ComplementSequence {

  /** Construct the sequence. */
  public A074235() {
    super(1, Z.ONE, new A009012());
  }
}
