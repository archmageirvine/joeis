package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040576 Continued fraction for <code>sqrt(601)</code>.
 * @author Georg Fischer
 */
public class A040576 extends PrependSequence {

  /** Construct the sequence. */
  public A040576() {
    super(new PeriodicSequence(1, 1, 15, 1, 5, 5, 3, 1, 1, 2, 1, 2, 2, 1, 9, 9, 1, 2, 2, 1, 2, 1, 1, 3, 5, 5, 1, 15, 1, 1, 48), Z.valueOf(24));
  }
}
