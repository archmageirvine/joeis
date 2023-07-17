package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a047.A047863;

/**
 * A000683 Number of colorings of labeled graphs on n nodes using exactly 2 colors, divided by 4.
 * @author Sean A. Irvine
 */
public class A000683 extends A047863 {

  /** Construct the sequence. */
  public A000683() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2).shiftRight(2);
  }
}
