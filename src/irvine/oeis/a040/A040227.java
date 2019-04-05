package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040227 Continued fraction for sqrt(243).
 * @author Georg Fischer
 */
public class A040227 extends PrependSequence {

  /** Construct the sequence. */
  public A040227() {
    super(new PeriodicSequence(1, 1, 2, 3, 15, 3, 2, 1, 1, 30), Z.valueOf(15));
  }
}
