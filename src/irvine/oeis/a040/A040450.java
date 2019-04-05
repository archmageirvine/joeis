package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040450 Continued fraction for sqrt(472).
 * @author Georg Fischer
 */
public class A040450 extends PrependSequence {

  /** Construct the sequence. */
  public A040450() {
    super(new PeriodicSequence(1, 2, 1, 1, 1, 4, 5, 4, 1, 1, 1, 2, 1, 42), Z.valueOf(21));
  }
}
