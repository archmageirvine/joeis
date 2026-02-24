package irvine.oeis.a392;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a007.A007732;

/**
 * A392345 allocated for Lorenzo Sauras Altuzarra.
 * @author Sean A. Irvine
 */
public class A392345 extends DistinctSequence {

  /** Construct the sequence. */
  public A392345() {
    super(1, new A007732());
  }
}
