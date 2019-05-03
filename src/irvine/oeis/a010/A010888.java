package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010888 Digital root of <code>n</code> (repeatedly add the digits of n until a single digit is reached).
 * @author Sean A. Irvine
 */
public class A010888 extends PrependSequence {

  /** Construct the sequence. */
  public A010888() {
    super(new PeriodicSequence(1, 2, 3, 4, 5, 6, 7, 8, 9), Z.ZERO);
  }
}

