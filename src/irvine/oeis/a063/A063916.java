package irvine.oeis.a063;

import irvine.oeis.PartialSumSequence;

/**
 * A063916 G.f.: (1 + Sum_{ i &gt;= 0 } 2^i*x^(2^(i+1)-1)) / (1-x)^3.
 * @author Sean A. Irvine
 */
public class A063916 extends PartialSumSequence {

  /** Construct the sequence. */
  public A063916() {
    super(new A063915());
  }
}
