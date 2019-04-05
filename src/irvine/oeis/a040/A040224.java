package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040224 Continued fraction for sqrt(240).
 * @author Georg Fischer
 */
public class A040224 extends PrependSequence {

  /** Construct the sequence. */
  public A040224() {
    super(new PeriodicSequence(2, 30), Z.valueOf(15));
  }
}
