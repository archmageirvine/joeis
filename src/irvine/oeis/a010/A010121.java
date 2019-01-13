package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010121.
 * @author Sean A. Irvine
 */
public class A010121 extends PrependSequence {

  /** Construct the sequence. */
  public A010121() {
    super(new PeriodicSequence(1, 1, 1, 4), Z.TWO);
  }
}

