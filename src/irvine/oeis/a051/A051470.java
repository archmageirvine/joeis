package irvine.oeis.a051;

import irvine.oeis.InverseSequence;
import irvine.oeis.a002.A002819;

/**
 * A051470 a(n) is least value of m for which the sum of Liouville's function from 1 to m is n.
 * @author Sean A. Irvine
 */
public class A051470 extends InverseSequence {

  /** Construct the sequence. */
  public A051470() {
    super(new A002819(), 1, 0);
  }
}
