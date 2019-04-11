package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040573 Continued fraction for <code>sqrt(598)</code>.
 * @author Georg Fischer
 */
public class A040573 extends PrependSequence {

  /** Construct the sequence. */
  public A040573() {
    super(new PeriodicSequence(2, 4, 1, 15, 2, 15, 1, 4, 2, 48), Z.valueOf(24));
  }
}
