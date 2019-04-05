package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040926 Continued fraction for sqrt(957).
 * @author Georg Fischer
 */
public class A040926 extends PrependSequence {

  /** Construct the sequence. */
  public A040926() {
    super(new PeriodicSequence(1, 14, 2, 14, 1, 60), Z.valueOf(30));
  }
}
