package irvine.oeis.a231;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231317 Number of (n+1) X (1+1) 0..2 arrays with no element equal to a strict majority of its diagonal and antidiagonal neighbors, with values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A231317 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A231317() {
    super(1, new long[] {0, 6, -12},
      new long[] {1, -6, -12, 8});
  }
}
