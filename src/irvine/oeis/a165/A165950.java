package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.a398.A398335;

/**
 * A165950 Number of acyclic digraphs on n labeled nodes with one source and one sink.
 * @author Gregory Morse
 */
public class A165950 extends A398335 {
  private int mN = 0;

  @Override
  public Z next() {
    return dagCount(++mN, 1, 1);
  }
}
