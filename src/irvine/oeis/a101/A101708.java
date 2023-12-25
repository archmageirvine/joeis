package irvine.oeis.a101;
// manually A328988/parmof2 at 2023-12-23 19:03

import irvine.oeis.a328.A328988;

/**
 * A101708 Number of partitions of n having positive even rank (the rank of a partition is the largest part minus the number of parts).
 * @author Georg Fischer
 */
public class A101708 extends A328988 {

  /** Construct the sequence. */
  public A101708() {
    super(0, r -> r > 0 && (r & 1) == 0);
  }
}
