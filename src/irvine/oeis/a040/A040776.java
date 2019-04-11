package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040776 Continued fraction for <code>sqrt(805)</code>.
 * @author Georg Fischer
 */
public class A040776 extends PrependSequence {

  /** Construct the sequence. */
  public A040776() {
    super(new PeriodicSequence(2, 1, 2, 5, 1, 13, 2, 1, 10, 1, 2, 13, 1, 5, 2, 1, 2, 56), Z.valueOf(28));
  }
}
