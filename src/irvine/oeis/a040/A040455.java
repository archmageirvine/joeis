package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040455 Continued fraction for <code>sqrt(477)</code>.
 * @author Georg Fischer
 */
public class A040455 extends PrependSequence {

  /** Construct the sequence. */
  public A040455() {
    super(new PeriodicSequence(1, 5, 3, 1, 4, 10, 1, 2, 2, 4, 2, 2, 1, 10, 4, 1, 3, 5, 1, 42), Z.valueOf(21));
  }
}
