package irvine.oeis.a051;

import irvine.math.cr.OtterConstants;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051491 Decimal expansion of Otter's rooted tree constant: lim_{n-&gt;inf} A000081(n+1)/A000081(n).
 * @author Sean A. Irvine
 */
public class A051491 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051491() {
    super(1, new OtterConstants().alpha());
  }
}

