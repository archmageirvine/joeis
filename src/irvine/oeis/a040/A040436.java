package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040436 Continued fraction for sqrt(458).
 * @author Georg Fischer
 */
public class A040436 extends PrependSequence {

  /** Construct the sequence. */
  public A040436() {
    super(new PeriodicSequence(2, 2, 42), Z.valueOf(21));
  }
}
