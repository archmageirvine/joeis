package irvine.oeis.a116;
// Generated by gen_seq4.pl trimirr/trimirror at 2023-08-07 19:48

import irvine.oeis.a134.A134083;
import irvine.oeis.triangle.Transpose;

/**
 * A116666 Triangle, row sums = number of edges in n-dimensional hypercubes.
 * @author Georg Fischer
 */
public class A116666 extends Transpose {

  /** Construct the sequence. */
  public A116666() {
    super(1, new A134083());
  }
}
