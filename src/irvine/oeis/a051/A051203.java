package irvine.oeis.a051;

import irvine.oeis.InverseSequence;
import irvine.oeis.a005.A005210;

/**
 * A051203 Least inverse of A005210.
 * @author Sean A. Irvine
 */
public class A051203 extends InverseSequence {

  /** Construct the sequence. */
  public A051203() {
    super(0, new A005210(), 0);
  }
}
