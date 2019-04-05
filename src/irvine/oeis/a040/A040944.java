package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040944 Continued fraction for sqrt(976).
 * @author Georg Fischer
 */
public class A040944 extends PrependSequence {

  /** Construct the sequence. */
  public A040944() {
    super(new PeriodicSequence(4, 6, 1, 2, 3, 1, 4, 2, 3, 2, 4, 1, 3, 2, 1, 6, 4, 62), Z.valueOf(31));
  }
}
