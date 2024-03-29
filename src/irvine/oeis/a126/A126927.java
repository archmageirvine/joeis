package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A126927 Coordination sequence for 24-dimensional cyclotomic lattice Z[zeta_39].
 * @author Georg Fischer
 */
public class A126927 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126927() {
    super(0, new long[] {1, 15, 120, 667, 2865, 10068, 29998, 77670, 177966, 363919, 655692, 
      1001649, 1214590, 1001649, 655692, 363919, 177966, 77670, 29998, 10068, 
      2865, 667, 120, 15, 1},
      new long[] {1, -24, 276, -2024, 10626, -42504, 134596, -346104, 735471, -1307504, 
      1961256, -2496144, 2704156, -2496144, 1961256, -1307504, 735471, -346104, 
      134596, -42504, 10626, -2024, 276, -24, 1});
  }
}
