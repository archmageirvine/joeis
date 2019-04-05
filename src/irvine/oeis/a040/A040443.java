package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040443 Continued fraction for sqrt(465).
 * @author Georg Fischer
 */
public class A040443 extends PrependSequence {

  /** Construct the sequence. */
  public A040443() {
    super(new PeriodicSequence(1, 1, 3, 2, 2, 2, 3, 1, 1, 42), Z.valueOf(21));
  }
}
