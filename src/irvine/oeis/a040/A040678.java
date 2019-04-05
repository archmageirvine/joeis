package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040678 Continued fraction for sqrt(705).
 * @author Georg Fischer
 */
public class A040678 extends PrependSequence {

  /** Construct the sequence. */
  public A040678() {
    super(new PeriodicSequence(1, 1, 4, 3, 10, 3, 4, 1, 1, 52), Z.valueOf(26));
  }
}
