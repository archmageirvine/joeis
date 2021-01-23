package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007374;

/**
 * A014573 Smallest k such that phi(x) = k has exactly n solutions.
 * @author Sean A. Irvine
 */
public class A014573 extends PrependSequence {

  /** Construct the sequence. */
  public A014573() {
    super(new A007374(), Z.THREE, Z.ZERO);
  }
}
