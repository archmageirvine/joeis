package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040696 Continued fraction for <code>sqrt(723)</code>.
 * @author Georg Fischer
 */
public class A040696 extends PrependSequence {

  /** Construct the sequence. */
  public A040696() {
    super(new PeriodicSequence(1, 7, 1, 52), Z.valueOf(26));
  }
}
