package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288030 Number of minimal edge covers in the grid graph P_3 X P_n.
 * @author Georg Fischer
 */
public class A288030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288030() {
    super(0, new long[] {-1, -2, -2, 9, 1, 32, -8, 0, -124, 36, 36, 31, -55, 15, -7, 35, 6, 3}, new long[] {1, 1, 6, 38, 190, 1021, 5494, 29042, 154772, 824695, 4386942, 23356322, 124344111, 661873859, 3523418150L, 18756407661L, 99845472493L, 531509598443L});
  }
}
