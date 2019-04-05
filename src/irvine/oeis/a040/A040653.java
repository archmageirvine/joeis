package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040653 Continued fraction for sqrt(680).
 * @author Georg Fischer
 */
public class A040653 extends PrependSequence {

  /** Construct the sequence. */
  public A040653() {
    super(new PeriodicSequence(13, 52), Z.valueOf(26));
  }
}
