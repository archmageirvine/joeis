package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040682 Continued fraction for <code>sqrt(709)</code>.
 * @author Georg Fischer
 */
public class A040682 extends PrependSequence {

  /** Construct the sequence. */
  public A040682() {
    super(new PeriodicSequence(1, 1, 1, 2, 7, 4, 3, 3, 4, 7, 2, 1, 1, 1, 52), Z.valueOf(26));
  }
}
