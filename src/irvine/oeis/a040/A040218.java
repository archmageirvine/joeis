package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040218 Continued fraction for sqrt(234).
 * @author Georg Fischer
 */
public class A040218 extends PrependSequence {

  /** Construct the sequence. */
  public A040218() {
    super(new PeriodicSequence(3, 2, 1, 2, 1, 2, 3, 30), Z.valueOf(15));
  }
}
