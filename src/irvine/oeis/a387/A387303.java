package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079840.
 * @author Sean A. Irvine
 */
public class A387303 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387303() {
    super(0, CR.valueOf(105).sqrt().sqrt().divide(CR.PI).log());
  }
}

