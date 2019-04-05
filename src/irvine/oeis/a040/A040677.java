package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040677 Continued fraction for sqrt(704).
 * @author Georg Fischer
 */
public class A040677 extends PrependSequence {

  /** Construct the sequence. */
  public A040677() {
    super(new PeriodicSequence(1, 1, 7, 13, 7, 1, 1, 52), Z.valueOf(26));
  }
}
