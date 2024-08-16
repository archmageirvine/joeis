package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A030483 Cubes of primes, with property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030483 extends Sequence1 {

  private static final Sequence A030482 = new A030482();

  @Override
  public Z next() {
    return A030482.next().pow(3);
  }
}
