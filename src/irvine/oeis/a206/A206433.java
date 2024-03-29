package irvine.oeis.a206;
// Generated by gen_seq4.pl robot/convprod at 2023-07-13 13:55

import irvine.oeis.a001.A001227;
import irvine.oeis.a002.A002865;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A206433 Total number of odd parts in the last section of the set of partitions of n.
 * @author Georg Fischer
 */
public class A206433 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A206433() {
    super(1, "1,1", new A002865(), new A001227());
  }
}
