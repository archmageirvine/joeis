package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040220 Continued fraction for <code>sqrt(236)</code>.
 * @author Georg Fischer
 */
public class A040220 extends PrependSequence {

  /** Construct the sequence. */
  public A040220() {
    super(new PeriodicSequence(2, 1, 3, 5, 1, 6, 1, 5, 3, 1, 2, 30), Z.valueOf(15));
  }
}
