package irvine.oeis.a359;

import irvine.oeis.a189.A189089;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A359540 allocated for Wolfe Padawer.
 * @author Sean A. Irvine
 */
public class A359540 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A359540() {
    super(new A189089().getCR().log());
  }
}
