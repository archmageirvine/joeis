package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040927 Continued fraction for <code>sqrt(958)</code>.
 * @author Georg Fischer
 */
public class A040927 extends PrependSequence {

  /** Construct the sequence. */
  public A040927() {
    super(new PeriodicSequence(1, 19, 1, 1, 1, 6, 4, 1, 1, 1, 1, 2, 1, 4, 1, 9, 2, 30, 2, 9, 1, 4, 1, 2, 1, 1, 1, 1, 4, 6, 1, 1, 1, 19, 1, 60), Z.valueOf(30));
  }
}
