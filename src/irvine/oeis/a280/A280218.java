package irvine.oeis.a280;

import irvine.oeis.a073.A073817;
import irvine.oeis.a093.A093305;

/**
 * A280218 Number of binary necklaces of length n with no subsequence 0000.
 * @author Gregory Morse
 */
public class A280218 extends A093305 {
  /** Construct the sequence. */
  public A280218() {
    super(new A073817());
  }
}
