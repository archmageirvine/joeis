package irvine.oeis.a085;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085964 Decimal expansion of the prime zeta function at 4.
 * @author Sean A. Irvine
 */
public class A085964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085964() {
    super(Zeta.zetap(4));
  }
}

