package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040907 Continued fraction for <code>sqrt(938)</code>.
 * @author Georg Fischer
 */
public class A040907 extends PrependSequence {

  /** Construct the sequence. */
  public A040907() {
    super(new PeriodicSequence(1, 1, 1, 2, 8, 2, 1, 1, 1, 60), Z.valueOf(30));
  }
}
