package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040905 Continued fraction for <code>sqrt(936)</code>.
 * @author Georg Fischer
 */
public class A040905 extends PrependSequence {

  /** Construct the sequence. */
  public A040905() {
    super(new PeriodicSequence(1, 1, 2, 6, 2, 1, 1, 60), Z.valueOf(30));
  }
}
