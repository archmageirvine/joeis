package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040155 Continued fraction for sqrt(168).
 * @author Georg Fischer
 */
public class A040155 extends PrependSequence {

  /** Construct the sequence. */
  public A040155() {
    super(new PeriodicSequence(1, 24), Z.valueOf(12));
  }
}
