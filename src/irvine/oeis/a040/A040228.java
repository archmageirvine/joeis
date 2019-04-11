package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040228 Continued fraction for <code>sqrt(244)</code>.
 * @author Georg Fischer
 */
public class A040228 extends PrependSequence {

  /** Construct the sequence. */
  public A040228() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 2, 1, 5, 1, 1, 9, 1, 6, 1, 9, 1, 1, 5, 1, 2, 1, 1, 1, 1, 1, 30), Z.valueOf(15));
  }
}
