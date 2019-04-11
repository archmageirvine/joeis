package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040277 Continued fraction for <code>sqrt(295)</code>.
 * @author Georg Fischer
 */
public class A040277 extends PrependSequence {

  /** Construct the sequence. */
  public A040277() {
    super(new PeriodicSequence(5, 1, 2, 3, 2, 6, 2, 3, 2, 1, 5, 34), Z.valueOf(17));
  }
}
