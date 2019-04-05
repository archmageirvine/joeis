package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040943 Continued fraction for sqrt(975).
 * @author Georg Fischer
 */
public class A040943 extends PrependSequence {

  /** Construct the sequence. */
  public A040943() {
    super(new PeriodicSequence(4, 2, 4, 62), Z.valueOf(31));
  }
}
