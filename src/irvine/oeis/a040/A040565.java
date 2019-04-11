package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040565 Continued fraction for <code>sqrt(590)</code>.
 * @author Georg Fischer
 */
public class A040565 extends PrependSequence {

  /** Construct the sequence. */
  public A040565() {
    super(new PeriodicSequence(3, 2, 4, 2, 3, 48), Z.valueOf(24));
  }
}
