package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040691 Continued fraction for <code>sqrt(718)</code>.
 * @author Georg Fischer
 */
public class A040691 extends PrependSequence {

  /** Construct the sequence. */
  public A040691() {
    super(new PeriodicSequence(1, 3, 1, 8, 7, 1, 1, 5, 2, 2, 1, 2, 3, 1, 3, 17, 1, 1, 2, 26, 2, 1, 1, 17, 3, 1, 3, 2, 1, 2, 2, 5, 1, 1, 7, 8, 1, 3, 1, 52), Z.valueOf(26));
  }
}
