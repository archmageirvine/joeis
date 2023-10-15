package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066412 Number of elements in the set phi_inverse(phi(n)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A066412 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066412() {
    super(1, new A000010(), k -> Z.valueOf(Euler.inversePhi(k).size()));
  }
}
