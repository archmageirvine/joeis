package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040499 Continued fraction for <code>sqrt(522)</code>.
 * @author Georg Fischer
 */
public class A040499 extends PrependSequence {

  /** Construct the sequence. */
  public A040499() {
    super(new PeriodicSequence(1, 5, 1, 1, 4, 1, 1, 5, 1, 44), Z.valueOf(22));
  }
}
