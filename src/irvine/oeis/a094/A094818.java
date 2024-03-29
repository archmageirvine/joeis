package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A094818 Number of classes of dp-homogeneous spherical curves with n double points.
 * @author Georg Fischer
 */
public class A094818 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094818() {
    super(0, new long[] {-1, -1, -3, -3, -6, -4, -5, -3, -3, -1, -1},
      new long[] {-1, 0, -1, 0, 0, 0, 1, 0, 1});
  }
}
