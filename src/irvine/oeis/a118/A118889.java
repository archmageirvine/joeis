package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118889 Ratio of Dimensions of the traditional Cartan exceptional group sequence A1,G2,F4,E6,E7,E8 to the Cartan matrix Dimension: Dimc={1, 2, 4, 6, 7, 8} DimG={3, 14, 52, 78, 133, 248} DimG/DimC={3, 7, 13, 13, 19, 31}.
 * @author Georg Fischer
 */
public class A118889 extends FiniteSequence {

  /** Construct the sequence. */
  public A118889() {
    super(3, 7, 13, 13, 19, 31);
  }
}
