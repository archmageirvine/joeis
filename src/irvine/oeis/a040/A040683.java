package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040683 Continued fraction for sqrt(710).
 * @author Georg Fischer
 */
public class A040683 extends PrependSequence {

  /** Construct the sequence. */
  public A040683() {
    super(new PeriodicSequence(1, 1, 1, 4, 1, 1, 1, 52), Z.valueOf(26));
  }
}
