package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A032599 Cubes of lucky numbers.
 * @author Sean A. Irvine
 */
public class A032599 extends A000959 {

  /** Construct the sequence. */
  public A032599() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
