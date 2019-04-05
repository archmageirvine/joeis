package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040659 Continued fraction for sqrt(686).
 * @author Georg Fischer
 */
public class A040659 extends PrependSequence {

  /** Construct the sequence. */
  public A040659() {
    super(new PeriodicSequence(5, 4, 1, 1, 3, 2, 10, 26, 10, 2, 3, 1, 1, 4, 5, 52), Z.valueOf(26));
  }
}
