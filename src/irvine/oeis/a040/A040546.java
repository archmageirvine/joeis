package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040546 Continued fraction for sqrt(570).
 * @author Georg Fischer
 */
public class A040546 extends PrependSequence {

  /** Construct the sequence. */
  public A040546() {
    super(new PeriodicSequence(1, 6, 1, 46), Z.valueOf(23));
  }
}
