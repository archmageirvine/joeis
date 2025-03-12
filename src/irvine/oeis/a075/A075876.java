package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A075876 Values of m for which A075825(m) = 1.
 * @author Sean A. Irvine
 */
public class A075876 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A075876() {
    super(1, 0, new A075825(), Z.ONE::equals);
  }
}
