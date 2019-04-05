package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040642 Continued fraction for sqrt(668).
 * @author Georg Fischer
 */
public class A040642 extends PrependSequence {

  /** Construct the sequence. */
  public A040642() {
    super(new PeriodicSequence(1, 5, 2, 12, 2, 5, 1, 50), Z.valueOf(25));
  }
}
