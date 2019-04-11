package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040490 Continued fraction for <code>sqrt(513)</code>.
 * @author Georg Fischer
 */
public class A040490 extends PrependSequence {

  /** Construct the sequence. */
  public A040490() {
    super(new PeriodicSequence(1, 1, 1, 5, 1, 4, 5, 2, 5, 4, 1, 5, 1, 1, 1, 44), Z.valueOf(22));
  }
}
