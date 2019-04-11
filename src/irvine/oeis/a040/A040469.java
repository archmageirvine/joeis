package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040469 Continued fraction for <code>sqrt(492)</code>.
 * @author Georg Fischer
 */
public class A040469 extends PrependSequence {

  /** Construct the sequence. */
  public A040469() {
    super(new PeriodicSequence(5, 1, 1, 10, 1, 1, 5, 44), Z.valueOf(22));
  }
}
