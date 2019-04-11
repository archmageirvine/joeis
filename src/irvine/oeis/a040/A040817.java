package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040817 Continued fraction for <code>sqrt(847)</code>.
 * @author Georg Fischer
 */
public class A040817 extends PrependSequence {

  /** Construct the sequence. */
  public A040817() {
    super(new PeriodicSequence(9, 1, 2, 6, 8, 6, 2, 1, 9, 58), Z.valueOf(29));
  }
}
