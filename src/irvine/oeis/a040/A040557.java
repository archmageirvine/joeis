package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040557 Continued fraction for sqrt(582).
 * @author Georg Fischer
 */
public class A040557 extends PrependSequence {

  /** Construct the sequence. */
  public A040557() {
    super(new PeriodicSequence(8, 48), Z.valueOf(24));
  }
}
