package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040773 Continued fraction for <code>sqrt(802)</code>.
 * @author Georg Fischer
 */
public class A040773 extends PrependSequence {

  /** Construct the sequence. */
  public A040773() {
    super(new PeriodicSequence(3, 7, 1, 3, 6, 28, 6, 3, 1, 7, 3, 56), Z.valueOf(28));
  }
}
