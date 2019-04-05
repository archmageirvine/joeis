package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040290 Continued fraction for sqrt(308).
 * @author Georg Fischer
 */
public class A040290 extends PrependSequence {

  /** Construct the sequence. */
  public A040290() {
    super(new PeriodicSequence(1, 1, 4, 1, 1, 34), Z.valueOf(17));
  }
}
