package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040392 Continued fraction for sqrt(413).
 * @author Georg Fischer
 */
public class A040392 extends PrependSequence {

  /** Construct the sequence. */
  public A040392() {
    super(new PeriodicSequence(3, 9, 1, 4, 1, 9, 3, 40), Z.valueOf(20));
  }
}
