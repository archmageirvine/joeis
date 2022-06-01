package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116708 Number of permutations of length n which avoid the patterns 2314, 4321.
 * @author Sean A. Irvine
 */
public class A116708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116708() {
    super(new long[] {-4, 40, -173, 429, -678, 715, -510, 243, -74, 13}, new long[] {1, 2, 6, 22, 86, 330, 1198, 4087, 13185, 40619});
  }
}
