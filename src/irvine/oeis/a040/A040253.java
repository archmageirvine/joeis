package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040253 Continued fraction for <code>sqrt(270)</code>.
 * @author Georg Fischer
 */
public class A040253 extends PrependSequence {

  /** Construct the sequence. */
  public A040253() {
    super(new PeriodicSequence(2, 3, 6, 3, 2, 32), Z.valueOf(16));
  }
}
