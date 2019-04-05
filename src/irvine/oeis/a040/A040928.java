package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040928 Continued fraction for sqrt(959).
 * @author Georg Fischer
 */
public class A040928 extends PrependSequence {

  /** Construct the sequence. */
  public A040928() {
    super(new PeriodicSequence(1, 29, 1, 60), Z.valueOf(30));
  }
}
