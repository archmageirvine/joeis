package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040621 Continued fraction for <code>sqrt(647)</code>.
 * @author Georg Fischer
 */
public class A040621 extends PrependSequence {

  /** Construct the sequence. */
  public A040621() {
    super(new PeriodicSequence(2, 3, 2, 2, 1, 1, 4, 25, 4, 1, 1, 2, 2, 3, 2, 50), Z.valueOf(25));
  }
}
