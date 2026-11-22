package irvine.oeis.a280;

import irvine.oeis.a074.A074048;
import irvine.oeis.a093.A093305;

/**
 * A280303 Number of binary necklaces of length n with no subsequence 00000.
 * @author Gregory Morse
 */
public class A280303 extends A093305 {
  /** Construct the sequence. */
  public A280303() {
    super(new A074048());
  }
}
