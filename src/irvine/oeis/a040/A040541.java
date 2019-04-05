package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040541 Continued fraction for sqrt(565).
 * @author Georg Fischer
 */
public class A040541 extends PrependSequence {

  /** Construct the sequence. */
  public A040541() {
    super(new PeriodicSequence(1, 3, 2, 1, 11, 5, 5, 11, 1, 2, 3, 1, 46), Z.valueOf(23));
  }
}
