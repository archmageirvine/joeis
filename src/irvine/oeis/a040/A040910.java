package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040910 Continued fraction for sqrt(941).
 * @author Georg Fischer
 */
public class A040910 extends PrependSequence {

  /** Construct the sequence. */
  public A040910() {
    super(new PeriodicSequence(1, 2, 11, 1, 14, 2, 2, 1, 1, 2, 2, 14, 1, 11, 2, 1, 60), Z.valueOf(30));
  }
}
