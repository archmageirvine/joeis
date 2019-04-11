package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040408 Continued fraction for <code>sqrt(429)</code>.
 * @author Georg Fischer
 */
public class A040408 extends PrependSequence {

  /** Construct the sequence. */
  public A040408() {
    super(new PeriodicSequence(1, 2, 2, 9, 1, 12, 1, 9, 2, 2, 1, 40), Z.valueOf(20));
  }
}
