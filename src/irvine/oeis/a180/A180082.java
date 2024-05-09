package irvine.oeis.a180;

import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005898;

/**
 * A180082 Semiprime centered cube numbers: m^3 + (m+1)^3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A180082 extends FilterSequence {

  /** Construct the sequence. */
  public A180082() {
    super(1, new A005898(), SEMIPRIME);
  }
}
