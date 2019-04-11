package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040839 Continued fraction for <code>sqrt(869)</code>.
 * @author Georg Fischer
 */
public class A040839 extends PrependSequence {

  /** Construct the sequence. */
  public A040839() {
    super(new PeriodicSequence(2, 11, 3, 2, 1, 1, 1, 1, 1, 14, 8, 2, 1, 4, 1, 2, 8, 14, 1, 1, 1, 1, 1, 2, 3, 11, 2, 58), Z.valueOf(29));
  }
}
