package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040559 Continued fraction for <code>sqrt(584)</code>.
 * @author Georg Fischer
 */
public class A040559 extends PrependSequence {

  /** Construct the sequence. */
  public A040559() {
    super(new PeriodicSequence(6, 48), Z.valueOf(24));
  }
}
