package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040237 Continued fraction for sqrt(253).
 * @author Georg Fischer
 */
public class A040237 extends PrependSequence {

  /** Construct the sequence. */
  public A040237() {
    super(new PeriodicSequence(1, 9, 1, 1, 1, 2, 1, 7, 4, 2, 2, 2, 4, 7, 1, 2, 1, 1, 1, 9, 1, 30), Z.valueOf(15));
  }
}
