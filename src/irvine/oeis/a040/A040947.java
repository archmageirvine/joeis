package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040947 Continued fraction for <code>sqrt(979)</code>.
 * @author Georg Fischer
 */
public class A040947 extends PrependSequence {

  /** Construct the sequence. */
  public A040947() {
    super(new PeriodicSequence(3, 2, 5, 1, 4, 1, 5, 2, 3, 62), Z.valueOf(31));
  }
}
