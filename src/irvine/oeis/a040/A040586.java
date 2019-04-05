package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040586 Continued fraction for sqrt(611).
 * @author Georg Fischer
 */
public class A040586 extends PrependSequence {

  /** Construct the sequence. */
  public A040586() {
    super(new PeriodicSequence(1, 2, 1, 1, 4, 2, 1, 2, 4, 1, 1, 2, 1, 48), Z.valueOf(24));
  }
}
