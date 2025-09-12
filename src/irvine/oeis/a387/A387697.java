package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387697 allocated for Daniel Hoyt.
 * @author Sean A. Irvine
 */
public class A387697 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387697() {
    super(0, new A387399().getCR().divide(CR.E));
  }
}

