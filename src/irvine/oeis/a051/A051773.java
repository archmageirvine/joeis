package irvine.oeis.a051;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a005.A005100;

/**
 * A051773 Deficient numbers that are not distended.
 * @author Sean A. Irvine
 */
public class A051773 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A051773() {
    super(new A005100(), new A051772());
  }
}
